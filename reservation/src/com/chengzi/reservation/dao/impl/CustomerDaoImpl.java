package com.chengzi.reservation.dao.impl;

import com.chengzi.reservation.dao.CustomerDao;
import com.chengzi.reservation.exception.BalanceException;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 橙子 on 2015/11/22.
 */

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

    Session session = new HibernateUtil().getSession();

    @Override
    public double getBalanceById(Serializable customerId) {
        String hql = "select c.balance from Customer c where c.id = ?";
        Query q = session.createQuery(hql);
        q.setInteger(0, (Integer) customerId);
        double balance = (Double)q.list().get(0);
        return balance;
    }

    @Override
    public void updateBalance(Serializable customerId, double price) {

        double balance = getBalanceById(customerId);
        if(balance<price){
            throw new BalanceException("您的余额不足");
        }

        String hql = "update Customer c set c.balance=balance-? where c.id =?";
        Query q = session.createQuery(hql);
        q.setDouble(0,price);
        q.setInteger(1, (Integer) customerId);
        q.executeUpdate();
    }
}
