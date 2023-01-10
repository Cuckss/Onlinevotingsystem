<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>

<%@include file="navbar.jsp" %>
<body>
<div class="form-container">
<form action="AdminLogin" method="post">
<h4>Please fill the required details:</h4>
<label for="aName">Name:</label>
<br>
<input name="aName" id="aName" type="text">
<br>

<label for="aPassword">Password:</label>
<br>
<input name="aPassword" id="aPassword" type="password">
<br>

<button type="submit">Login</button>
</form>
</div>  
</body>
</html>