<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome voter</title>

</head>
<%@include file="navbar.jsp" %>
<body>
<div class="form-container">
<form action="Vote" method="post">
<h4>Please fill the required details:</h4>
<label for="voterNumber">Voter Id:</label>
<br>
<input name="voterNumber" id="voterNumber" type="text">
<br>

<label for="partie">choose a party:</label>

<select name="partie"id="partie">
<option value="Aam">Aam Aadmi Party</option>
<option value="bjp">BJP</option>
<option value="bsp">BSP</option>
<option value="cpi">CPI</option>
<option value="bjp">Congress</option>

</select>



<button type="submit">Submit</button>
</form>
</div>  
</body>
</html>