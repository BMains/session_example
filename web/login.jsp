<%--
  Created by IntelliJ IDEA.
  User: jgk29
  Date: 11/5/2018
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="central">

    <input type="hidden" name="hiddenA" value="start">
    <label>Please login with your user name and password.</label><br>

    <label>Username: </label>
    <input type="text" name="username"><br>

    <label>Password: </label>
    <input type="password" name="passwd"><br>

    <input type="submit" value="Login">
</form>

</body>
</html>
