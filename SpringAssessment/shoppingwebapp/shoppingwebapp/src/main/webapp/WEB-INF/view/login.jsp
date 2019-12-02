<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>${msg}</h3>
	<fieldset>
		<h1><legend style="color:red">Welcome User For Shopping</legend></h1>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" name="Login"></td>
				</tr>

			</table>
		</form>
	</fieldset>
	<a href="./register">click here for Register</a>
</body>
</html>