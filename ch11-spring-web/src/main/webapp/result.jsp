<%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/5/28
  Time: 8:11 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Integer res = (Integer) request.getAttribute("key");
        System.out.println("res=="+res);
    %>
    <font style="size:40px;color:red">res==<%=res%></font>
</body>
</html>
