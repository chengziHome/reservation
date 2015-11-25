package com.chengzi.reservation.controller;

import com.chengzi.reservation.bean.Customer;
import com.chengzi.reservation.bean.Meal;
import com.chengzi.reservation.bean.Order;
import com.chengzi.reservation.dao.BaseDao;
import com.chengzi.reservation.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
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
public class AdminOrderController {

    @Autowired
    BaseDao baseDao ;

    @RequestMapping("admin/addOrder.do")
    public String add(HttpServletRequest request,Integer customerId,Integer mealId){

        Customer customer = (Customer) baseDao.getById(Customer.class,customerId);
        Meal meal = (Meal) baseDao.getById(Meal.class,mealId);

        Order order = new Order();
        order.setCustomer(customer);
        order.setMeal(meal);

        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        order.setDate(sf.format(date));
        baseDao.add(order);

        Session session = new HibernateUtil().getSession();
        String hql = "from Order";
        Query q = session.createQuery(hql);
        List orders = q.list();
        request.setAttribute("orders",orders);
        return "admin/order";
    }

    @RequestMapping("admin/updateOrder.do")
    public String update(HttpServletRequest request,Integer orderId,Integer customerId,Integer mealId){

        Customer customer = (Customer) baseDao.getById(Customer.class,customerId);
        Meal meal = (Meal) baseDao.getById(Meal.class,mealId);

        Order order = new Order();
        order.setId(orderId);
        order.setCustomer(customer);
        order.setMeal(meal);

        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        order.setDate(sf.format(date));
        baseDao.update(order);

        Session session = new HibernateUtil().getSession();
        String hql = "from Order";
        Query q = session.createQuery(hql);
        List orders = q.list();
        request.setAttribute("orders",orders);
        return "admin/order";
    }

    @RequestMapping("admin/deleteOrder.do")
    public String delete(HttpServletRequest request,Integer id){

        Order order= (Order) baseDao.getById(Order.class,id);
        baseDao.delete(order);

        Session session = new HibernateUtil().getSession();
        String hql = "from Order";
        Query q = session.createQuery(hql);
        List orders = q.list();
        request.setAttribute("orders",orders);
        return "admin/order";
    }

    @RequestMapping("admin/listOrder.do")
    public String list(HttpServletRequest request){
        Session session = new HibernateUtil().getSession();
        String hql = "from Order";
        Query q = session.createQuery(hql);
        List orders = q.list();
        request.setAttribute("orders",orders);
        return "admin/order";
    }

}
