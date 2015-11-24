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

<%
  String id= request.getParameter("id");
%>

<body>
  <form action="/view/admin/updateCustomer.do">
    id:<input type="text" name="id" value="<%=id%>"/><br>
    姓名：<input type="text" name="name"/><br>
    密码：<input type="password" name="password"/><br>
    电话号码：<input type="text" name="telNumber"/><br>
    账户余额：<input type="text" name="balance"/><br>
    <input type="submit" value="提交更改"/>
  </form>


</body>
</html>
