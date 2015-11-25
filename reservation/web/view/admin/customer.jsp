<%@ page import="java.util.List" %>
<%@ page import="com.chengzi.reservation.bean.Customer" %>
<%--
  Created by IntelliJ IDEA.
  User: 橙子
  Date: 2015/11/24
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>

<body>

<form action="/view/admin/addCustomer.do">
  姓名：<input type="text" name="name"/><br>
  密码：<input type="password" name="password"/><br>
  电话号码：<input type="text" name="telNumber"/><br>
  账户余额：<input type="text" name="balance"/><br>
  <input type="submit" value="添加新客户"/>
</form>


<h4>用户信息</h4>
id &nbsp;&nbsp;name &nbsp;&nbsp;password &nbsp;&nbsp; telNumber &nbsp;&nbsp; balance <br>
  <c:forEach var="customer" items="${customers}">
    ${customer.id}&nbsp;&nbsp;
    ${customer.name}&nbsp;&nbsp;
    ${customer.password}&nbsp;&nbsp;
    ${customer.telNumber}&nbsp;&nbsp;
    ${customer.balance}&nbsp;&nbsp;
    <a href="updateCustomer.jsp?id=${customer.id}">更改</a>
    <a href="/view/admin/deleteCustomer.do?id=${customer.id}">删除</a>
    <br>
  </c:forEach>

</body>
</html>
