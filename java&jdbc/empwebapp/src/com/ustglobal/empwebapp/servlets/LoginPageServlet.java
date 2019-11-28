package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		
		String id="";
		Cookie [] cookies = req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie: cookies)
		{
			if(cookie.getName().equals("alwaysRemember"))
			{
				id = cookie.getValue();
			}
		}
		}
//		out.println("<html>");
//		out.println("<fieldset > <center><legend><h1>Login Form</h1></legend></center>");
//		out.println("<table align='center'> <h1>	<form action='./login'  method='post'>");
//		out.println("<tr><td><h3>Id:</h3></td> ");
//		out.println("<td><input type='number' name='id' value='"+id+"'></td></tr>");
//		out.println("<tr><td><h3>Password:</h3></td>");
//		out.println("<td><input type='password' name='password'></td> </tr>");
//		out.println("<tr>");
//		out.println("<td></td>");
//		out.println("<td><input type='checkbox' name='rememberme' value='checked'>Remember me<br> </td></tr>");
//		out.println("<tr>");
//		out.println("<td><h3><input type='reset' name='reset' ></h3></td>");
//		out.println("<td><h3><input type='submit' name='submit' value='login'></h3></td>");
//		out.println("</tr>");
//		out.println("<tr>");
//		out.println("<td colspan=2><br> <a href='./register.html'> Register</a></td>");
//		out.println("</tr>");
//		out.println("</form>");
//		out.println("</h1>");
//		out.println("</table>");
//		out.println("</fieldset>");
//		out.println("</html>");
//		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
