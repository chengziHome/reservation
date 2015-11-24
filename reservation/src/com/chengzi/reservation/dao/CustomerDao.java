package com.chengzi.reservation.dao;

import java.io.Serializable;

/**
 * Created by 橙子 on 2015/11/22.
 */
public interface CustomerDao {
    public double getBalanceById(Serializable customerId);
    public void updateBalance(Serializable customerId, double price);
}
