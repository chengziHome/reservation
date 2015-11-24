package com.chengzi.reservation.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 橙子 on 2015/11/22.
 */
public interface BaseDao {

    public void add(Object obj);
    public void update(Object obj);
    public void delete(Object obj);
    public List list(String hql);
    public Object getById(Class cls, Serializable id);
}
