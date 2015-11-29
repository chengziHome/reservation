package com.chengzi.reservation.controller;

import com.chengzi.reservation.bean.Order;
import com.chengzi.reservation.bean.Customer;
import com.chengzi.reservation.bean.Meal;
import com.chengzi.reservation.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 橙子 on 2015/11/24.
 */

@Controller
@RequestMapping("/view/")
public class CustomerController {

    @Autowired
    BaseDao baseDao;

    @RequestMapping("customer/purchase.do")
    public String purchase(HttpServletRequest request,Integer mealId,Integer customerId){
        return null;
    }

    @RequestMapping("customer/listMeal.do")
    public String listMeal(HttpServletRequest request){
        String hql = " from Meal";
        List meals = baseDao.list(hql);
        request.setAttribute("meals",meals);
        return "customer/meal";
    }

    @RequestMapping("customer/listOrder.do")
    public String listOrder(HttpServletRequest request,Integer customerId){
        String hql = " from Order o where o.customer.id ="+customerId;
        List orders = baseDao.list(hql);
        request.setAttribute("orders",orders);
        return "customer/order";
    }

}
