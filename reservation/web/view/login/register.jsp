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
<h4>${error}</h4>
<h3>请输入注册信息</h3><br>
  <form action="/view/register.do">
    姓名：<input type="text" name="name"/><br>
    密码：<input type="text" name="password"/><br>
    电话号码：<input type="text" name="telNumber"><br>
    <input type="submit" value="register">
  </form>
</body>
</html>
