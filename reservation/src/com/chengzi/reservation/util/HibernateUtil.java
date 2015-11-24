package com.chengzi.reservation.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 橙子 on 2015/11/22.
 */
public class HibernateUtil {

    public Session getSession(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");

        Session session = sessionFactory.openSession();
        return session;
    }


}
