package com.chengzi.reservation.service.impl;

import com.chengzi.reservation.dao.CustomerDao;
import com.chengzi.reservation.dao.MealDao;
import com.chengzi.reservation.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chengzi on 2015/11/29.
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private MealDao mealDao;

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void purchase(Integer customerId, Integer mealId) {

        System.out.println(mealDao);
        double price = mealDao.getPriceById(mealId);
        customerDao.updateBalance(customerId,price);
        mealDao.updatestock(mealId);

    }
}
