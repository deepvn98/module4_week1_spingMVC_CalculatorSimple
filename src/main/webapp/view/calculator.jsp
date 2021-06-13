<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/6/2021
  Time: 10:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="Calculator" method="post">
    <h1>Máy Tính Đơn Giản</h1>
    <input type="number" name="numberone" placeholder="số thứ nhất"><br><br>
    <input type="number" name="numbertwo" placeholder="số thứ Hai"><br><br>
    <select name="select">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <button type="submit">Tính</button>
    <br><br>
    <p>-----------------------------------</p>
    <br>
    <h2 id="kq">result: ${result} </h2>
</form>
</body>
</html>
