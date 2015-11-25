<%@ page import="com.chengzi.reservation.bean.Order" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: 橙子
  Date: 2015/11/25
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>

<body>
<a href="/view/customer/listMeal.do">返回点餐</a><br>

<h3>您有如下订单：</h3>
<c:forEach var="order" items="${orders}">
  ${order.id}
  ${order.meal.name}
  ${order.date}
  <br>
</c:forEach>

</body>
</html>
