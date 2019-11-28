<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>
<%@page session="false"%>
<%--no cookie because session is not created --%>
<%@page isThreadSafe="false"%>
<%--it works as single threaded --%>
<%@page errorPage="error.jsp"%>
<%-- --%>

<%!
public void jspInit() {
		System.out.println("this is init phase");
	}

	public void jspDestroy() {
		System.out.println("this is destroy phase");
	}
	%>
<!DOCTYPE html>
<%@page import=" java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	Date date = new Date();
int j=1/0;
	m();
%>
<%!public int i = 10;

	public void m() {
		System.out.println(i);
	}%>
<body>
	<h1 style="color: green;">
		Date and Time is:<%=date%></h1>
	<h1><%=i%></h1>
</body>
</html>