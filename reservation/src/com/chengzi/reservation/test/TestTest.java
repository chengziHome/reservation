package com.chengzi.reservation.test;

import com.chengzi.reservation.bean.Order;
import com.chengzi.reservation.dao.BaseDao;
import com.chengzi.reservation.dao.impl.BaseDaoImpl;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class TestTest {

    Session session = new HibernateUtil().getSession();

    private BaseDao baseDao = new BaseDaoImpl();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMain() throws Exception {
//        String hql = "from Order";
//        List orders = baseDao.list(hql);
//        System.out.println(orders==null);
//        Order order = (Order) baseDao.getById(Order.class,1);
//        Meal meal = (Meal) baseDao.getById(Meal.class,1);
//        System.out.println(meal==null);
//        System.out.println(meal);
//
//        Customer c = (Customer) baseDao.getById(Customer.class,1);
//        System.out.println(c==null);
//        System.out.println(c);

        Order order = (Order) baseDao.getById(Order.class,1);
        System.out.println(order ==null);
        System.out.println(order);
    }



} 
