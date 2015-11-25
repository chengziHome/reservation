package com.chengzi.reservation.test;

import com.chengzi.reservation.bean.Admin;
import com.chengzi.reservation.bean.Customer;
import com.chengzi.reservation.bean.Meal;
import com.chengzi.reservation.bean.Order;
import com.chengzi.reservation.dao.BaseDao;
import com.chengzi.reservation.dao.MealDao;
import com.chengzi.reservation.dao.impl.BaseDaoImpl;
import com.chengzi.reservation.dao.impl.MealDaoImpl;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.LobHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Clob;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


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

        Meal meal = (Meal) baseDao.getById(Meal.class,2);
        baseDao.delete(meal);

    }



} 
