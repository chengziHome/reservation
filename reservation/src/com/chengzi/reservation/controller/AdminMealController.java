package com.chengzi.reservation.controller;

import com.chengzi.reservation.bean.Meal;
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
public class AdminMealController {

    @Autowired
    BaseDao baseDao;

    @RequestMapping("admin/addMeal.do")
    public String add(HttpServletRequest request,Meal meal){
        baseDao.add(meal);

        String hql = "from Meal";
        List meals = baseDao.list(hql);
        request.setAttribute("meals",meals);
        return "admin/meal";
    }

    @RequestMapping("admin/deleteMeal.do")
    public String delete(HttpServletRequest request,Integer id){
        Meal meal = (Meal) baseDao.getById(Meal.class,id);
        baseDao.delete(meal);

        String hql = "from Meal";
        List meals = baseDao.list(hql);
        request.setAttribute("meals",meals);
        return "admin/meal";
    }

    @RequestMapping("admin/updateMeal.do")
    public String update(HttpServletRequest request,Meal meal){
        baseDao.update(meal);

        String hql = "from Meal";
        List meals = baseDao.list(hql);
        request.setAttribute("meals",meals);
        return "admin/meal";
    }

    @RequestMapping("admin/listMeal.do")
    public String list(HttpServletRequest request){
        String hql = "from Meal";
        List meals = baseDao.list(hql);
        request.setAttribute("meals",meals);
        return "admin/meal";
    }

}
