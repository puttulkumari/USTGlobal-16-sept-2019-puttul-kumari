<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend><h2 >Register here!!!</h2></legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><input type="email" name="email"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./login">Click Here To Login</a>
</body>
</html>