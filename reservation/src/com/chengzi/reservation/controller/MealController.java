package com.chengzi.reservation.controller;

import com.chengzi.reservation.bean.Meal;
import com.chengzi.reservation.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 橙子 on 2015/11/24.
 */

@Controller
@RequestMapping("/view/")
public class MealController {

    @Autowired
    BaseDao baseDao;

    public String add(HttpServletRequest request,Meal meal){

        return null;
    }

    public String delete(HttpServletRequest request,Integer mealId){

        return null;
    }



}
