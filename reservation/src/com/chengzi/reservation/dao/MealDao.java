package com.chengzi.reservation.dao;

/**
 * Created by 橙子 on 2015/11/24.
 */
public interface MealDao {

    public double getPriceById(Integer mealId);
    public void updatestock(Integer mealId);

}
