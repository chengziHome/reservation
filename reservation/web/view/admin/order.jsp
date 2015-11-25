<%@ page import="java.util.List" %>
<%@ page import="com.chengzi.reservation.bean.Order" %>
<%--
  Created by IntelliJ IDEA.
  User: 橙子
  Date: 2015/11/24
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>

<body>
<form action="/view/admin/addOrder.do">
  顾客ID：<input type="text" name="customerId"/><br>
  餐品ID：<input type="text" name="mealId"/><br>
  <input type="submit" value="添加订单"/>
</form>

<c:forEach var="order" items="${orders}">
  ${order.id}
  ${order.customer.name}
  ${order.meal.name}
  ${order.date}
  <a href="updateOrder.jsp?id=${order.id}">修改</a>
  <a href="/view/admin/deleteOrder.do?id=${order.id}">删除</a>
  <br>
</c:forEach>

</body>
</html>
