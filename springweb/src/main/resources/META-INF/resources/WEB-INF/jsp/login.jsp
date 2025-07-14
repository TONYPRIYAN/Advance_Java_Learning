<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	Welcome 
	<p style="background-color:tomato;"><b>${errmsg}</b></p>
	<form method="post">
	Name:<input type="text" name="name">
	Password:<input type="password" name="pwd">
	<input type="submit">
	</form>
</body>
</html>