package com.chengzi.reservation.test;

import com.chengzi.reservation.dao.BaseDao;
import com.chengzi.reservation.dao.CustomerDao;
import com.chengzi.reservation.dao.MealDao;
import com.chengzi.reservation.dao.impl.BaseDaoImpl;
import com.chengzi.reservation.dao.impl.CustomerDaoImpl;
import com.chengzi.reservation.dao.impl.MealDaoImpl;
import com.chengzi.reservation.service.CustomerService;
import com.chengzi.reservation.service.impl.CustomerServiceImpl;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class TestTest {

    Session session = new HibernateUtil().getSession();

    private BaseDao baseDao = new BaseDaoImpl();

    private CustomerService customerService = new CustomerServiceImpl();

    private CustomerDao customerDao = new CustomerDaoImpl();

    private MealDao mealDao = new MealDaoImpl();


    public TestTest() {
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMain() throws Exception {

        customerService.purchase(1,1);

    }



} 
