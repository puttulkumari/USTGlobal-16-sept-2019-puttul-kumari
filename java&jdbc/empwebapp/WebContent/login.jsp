<%@ page language='java' contentType='text/html; charset=ISO-8859-1'
	pageEncoding='ISO-8859-1'%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='ISO-8859-1'>
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<%
String id="";
Cookie [] cookies = request.getCookies();
if(cookies!=null) {
for(Cookie cookie: cookies)
{
	if(cookie.getName().equals("alwaysRemember"))
	{
		id = cookie.getValue();
	}
}
} %>
<body>
<h4><%=msg%></h4>
	<fieldset>
		<center>
			<legend>
				<h1>Login Form</h1>
			</legend>
		</center>

		<table align='center'>
			<h1>

				<form action='./login' method='post'>
					<tr>
						<td><h3>Id:</h3></td>
						<td><input type='number' name='id' value='<%=id%>'></td>
					</tr>

					<tr>
						<td><h3>Password:</h3></td>
						<td><input type='password' name='password'></td>
					</tr>
					<tr>
						<td></td>
						<td><input type='checkbox' name='rememberme' value='checked'>Remember
							me<br></td>
					</tr>

					<tr>
						<td><h3>
								<input type='reset' name='reset'>
							</h3>
						</td>
						<td><h3>
								<input type='submit' name='submit' value='login'>
							</h3></td>
					<tr>
						<td colspan=2><br> <a href='./register.html'>
								Register</a></td>
					</tr>
				</form>
			</h1>
		</table>
	</fieldset>
</body>
</html>