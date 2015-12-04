<%@ page import="java.util.List" %>
<%@ page import="com.chengzi.reservation.bean.Meal" %>
<%--
  Created by IntelliJ IDEA.
  User: 橙子
  Date: 2015/11/25
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>

<a href="order.jsp">查看订单</a>
 <h4>有如下餐品可以选购</h4>

<c:forEach var="meal" items="${meals}">
  ${meal.name}
  ${meal.price}
  ${meal.stock}
  <a href="/view/customer/purchase.do?customerId=${customerId}&mealId=${meal.id}">点击选购</a>
  <br>
</c:forEach>
</body>
</html>
