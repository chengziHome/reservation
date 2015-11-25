package com.chengzi.reservation.controller;

import com.chengzi.reservation.bean.Customer;
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
public class AdminCustomerInfoController {

    @Autowired
    BaseDao baseDao ;

    @RequestMapping("admin/addCustomer.do")
    public String add(HttpServletRequest request,Customer customer){
        baseDao.add(customer);
        Session session = new HibernateUtil().getSession();
        String hql = "from Customer";
        Query q = session.createQuery(hql);
        List customers = q.list();
        request.setAttribute("customers",customers);
        return "admin/customer";
    }

    @RequestMapping("admin/updateCustomer.do")
    public String update(HttpServletRequest request,Customer customer){
        baseDao.update(customer);
        Session session = new HibernateUtil().getSession();
        String hql = "from Customer";
        Query q = session.createQuery(hql);
        List customers = q.list();
        request.setAttribute("customers",customers);
        return "admin/customer";
    }

    @RequestMapping("admin/deleteCustomer.do")
    public String delete(HttpServletRequest request,Integer id){
        Customer customer = (Customer) baseDao.getById(Customer.class,id);
        baseDao.delete(customer);

        Session session = new HibernateUtil().getSession();
        String hql = "from Customer";
        Query q = session.createQuery(hql);
        List customers = q.list();
        request.setAttribute("customers",customers);

        return "admin/customer";
    }

    @RequestMapping("admin/listCustomer.do")
    public String list(HttpServletRequest request){
        Session session = new HibernateUtil().getSession();
        String hql = "from Customer";
        Query q = session.createQuery(hql);
        List customers = q.list();
        request.setAttribute("customers",customers);
        return "admin/customer";
    }
}
