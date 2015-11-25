<%@ page import="java.util.List" %>
<%@ page import="com.chengzi.reservation.bean.Meal" %>
<%--
  Created by IntelliJ IDEA.
  User: 橙子
  Date: 2015/11/24
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>

<body>
<form action="/view/admin/addMeal.do">
  菜品名称：<input type="text" name="name"/><br>
  菜品库存：<input type="text" name="stock"/><br>
  菜品价钱：<input type="text" name="price"/><br>
  <input type="submit" value="添加新菜品"/><br>
</form>

<c:forEach var="meal" items="${meals}">
  ${meal.id}
  ${meal.name}
  ${meal.mealIntro}
  ${meal.mealPic}
  ${meal.stock}
  ${meal.price}
  <a href="/view/admin/deleteMeal.do?id=${meal.id}">删除</a>
  <a href="updateMeal.jsp?id=${meal.id}">更改</a>
  <br>
</c:forEach>

</body>
</html>
