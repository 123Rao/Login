<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
		<h2>${msg}</h2>
		<form action="login">
		<input type ="text" name="username" placeholder="User ID"><br>
		<br>
		<input type ="password" name="password" placeholder="Password"><br>
		<br>
		<button>Submit</button>
		</form>
</body>
</html>