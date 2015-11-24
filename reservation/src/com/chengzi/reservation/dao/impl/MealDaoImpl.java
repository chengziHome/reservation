package com.chengzi.reservation.dao.impl;

import com.chengzi.reservation.dao.MealDao;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 橙子 on 2015/11/24.
 */

@Repository("mealDao")
public class MealDaoImpl implements MealDao {

    Session session = new HibernateUtil().getSession();

    @Override
    public double getPriceById(Integer mealId) {
        String hql ="select m.price from Meal m where m.id = ?";
        Query q = session.createQuery(hql);
        q.setInteger(0,mealId);
        List list = q.list();
        double price = (Double) list.get(0);
        return price;
    }

    @Override
    public void updatestock(Integer mealId) {
        String hql = "update Meal m set m.stock=stock-1 where m.id = ?";
        Query q = session.createQuery(hql);
        q.setInteger(0,mealId);
        q.executeUpdate();
    }

}
