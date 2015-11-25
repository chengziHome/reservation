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

<% String id = request.getParameter("id"); %>

<body>
<form action="/view/admin/updateMeal.do">
  菜品ID：<input type="text" name="id" value="<%=id%>"/><br>
  菜品名称：<input type="text" name="name"/><br>
  菜品库存：<input type="text" name="stock"/><br>
  菜品价钱：<input type="text" name="price"/><br>
  <input type="submit" value="更新菜品"/>
</form>

</body>
</html>
