<%--
  Created by IntelliJ IDEA.
  User: 橙子
  Date: 2015/11/24
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<% String error = (String) request.getAttribute("error"); %>
<body>
<h2>${error}</h2>
  <form action="/view/customerlogin.do">
    姓名：<input type="text" name="name"/><br>
    密码：<input type="text" name="password"/><br>
    <input type="submit" value="login">
    <a href="register.jsp">注册新用户</a>
  </form>
</body>
</html>
