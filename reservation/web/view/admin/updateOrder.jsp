<%--
  Created by IntelliJ IDEA.
  User: 橙子
  Date: 2015/11/24
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>

<% String id = request.getParameter("id");%>

<body>
  <form action="/view/admin/updateOrder.do">
    订单单号：<input type="text" value="<%=id%>" name="orderId"/><br>
    点餐顾客：<input type="text" name="customerId"/><br>
    订餐餐品：<input type="text" name="mealId"/><br>
    <input type="submit" value="修改订单"/>
  </form>
</body>
</html>
