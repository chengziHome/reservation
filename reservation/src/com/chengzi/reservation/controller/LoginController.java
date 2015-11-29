package com.chengzi.reservation.controller;

import com.chengzi.reservation.bean.Customer;
import com.chengzi.reservation.dao.BaseDao;
import com.chengzi.reservation.util.HibernateUtil;
import org.apache.taglibs.standard.lang.jstl.IntegerDivideOperator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 橙子 on 2015/11/24.
 */

@Controller
@RequestMapping("/view/")
public class LoginController{

    Session session = new HibernateUtil().getSession();

    @Autowired
    private BaseDao baseDao;

    @RequestMapping(value="adminlogin.do",method = RequestMethod.POST)
    public String adminLogin(HttpServletRequest request,String name,String password){

        try {
            String hql = "select a.password from Admin a where a.name = "+"'"+name+"'";
            String pw = baseDao.list(hql).get(0).toString();
            if(pw!=null&&password.equals(pw)){
                return "admin/admin";
            }else{
                request.setAttribute("error","name or password is wrong!");
                return "login/adminLogin";
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error","name or password is wrong!");
            return "login/adminLogin";
        }
    }

    @RequestMapping(value = "customerlogin.do",method = RequestMethod.POST)
    public String customerLogin(HttpSession session,HttpServletRequest request, String name, String password){

        try {
            String hql = " select c.id,c.password from Customer c where c.name="+"'"+name+"'";
            List list = baseDao.list(hql);

            Object[] obj = (Object[]) list.get(0);
            Integer id = (Integer) obj[0];
            String pw = (String) obj[1];
            if(pw!=null&&password.equals(pw)){
                session.setAttribute("customerId",id);
                return "customer/customer";
            }else{
                request.setAttribute("error","name or password is wrong!");
                return "login/customerLogin";
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error","name or password is wrong!");
            return "login/customerLogin";
        }
    }

    @RequestMapping("register.do")
    public String register(HttpServletRequest request ,Customer customer){
        try {
            baseDao.add(customer);
            return "customer/customer";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error","something wrong!");
            return "login/register";
        }
    }

}
