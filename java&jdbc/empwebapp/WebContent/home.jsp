<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.Employee_info"
	scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<center>Welcome <%=info.getName() %></center>
	</h1>
	<a href='./search.html'><h1>search</h1></a>
	<a href='./changepassword.jsp'><h1>Change password</h1></a>
	<a href='./logout' ; style="float: right"><h1>Logout</h1></a>
</body>
</html>