package com.chengzi.reservation.controller;

import com.chengzi.reservation.dao.BaseDao;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 橙子 on 2015/11/24.
 */

@Controller
@RequestMapping("/view/")
public class CustomerMealController {

    @Autowired
    BaseDao baseDao;

    public String purchase(HttpServletRequest request,Integer mealId,Integer customerId){



        return null;
    }

    public String list(HttpServletRequest request){
        Session session = new HibernateUtil().getSession();
        String hql = " from Meal";
        Query q = session.createQuery(hql);
        List meals = q.list();
        request.setAttribute("meals",meals);
        return "customer/meal";
    }

}
