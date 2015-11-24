package com.chengzi.reservation.dao.impl;

import com.chengzi.reservation.dao.BaseDao;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.*;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 橙子 on 2015/11/22.
 */

@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {

    protected Session session = new HibernateUtil().getSession();

    @Override
    public void add(Object obj) {
        Transaction tran = session.beginTransaction();
        try {
            session.save(obj);
            tran.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tran.rollback();
        }finally{
            session.close();
        }
    }

    @Override
    public void update(Object obj) {
        Transaction tran = session.beginTransaction();
        try {
            session.update(obj);
            tran.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tran.rollback();
        }finally{
            session.close();
        }
    }

    @Override
    public void delete(Object obj) {
        Transaction tran = session.beginTransaction();
        try {
            session.delete(obj);
            tran.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tran.rollback();
        }finally{
            session.close();
        }
    }

    @Override
    public List list(String hql) {
        Query q = session.createQuery(hql);
        List list = null;
        try {
            list = q.list();
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getById(Class cls, Serializable id) {
        try {
            return session.get(cls,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
