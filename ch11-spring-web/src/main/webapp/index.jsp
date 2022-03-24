<%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/5/28
  Time: 8:04 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>学生注册</p>
    <form action="/myWeb/res" method="post">
        <table border="2">
            <tr>
                <td>ID：</td>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <td>Name：</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Email：</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td>age:</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr align="center">
                <td><input type="submit" value="submit"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
