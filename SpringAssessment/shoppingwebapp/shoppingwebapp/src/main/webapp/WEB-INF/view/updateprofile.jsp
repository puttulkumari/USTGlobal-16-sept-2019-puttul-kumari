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
		<a href="./home">Home</a> <a href="./logout">Logout</a>
		<form action="./updateprofile" method="post">
			<table>
			
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
			

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
			
				<tr>
					<td></td>
					<td><input type="submit" value="update"></td>
				</tr>

			</table>

		</form>
	</fieldset>


</body>
</html>