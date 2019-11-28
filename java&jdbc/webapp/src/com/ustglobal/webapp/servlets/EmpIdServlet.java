//package com.ustglobal.webapp.servlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.DriverManager;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class EmpIdServlet extends HttpServlet 
//{
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
//	{
//		
//		
//		try {
//					resp.setContentType("text/html");
//						PrintWriter out = resp.getWriter();
//
//						
//						try {
//				
//							Class.forName("com.mysql.jdbc.Driver");
//
//							String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//							
//							Connection conn = null;
//							PreparedStatement pstmt = null;
//							ResultSet rs = null;
//							conn = DriverManager.getConnection(url);
//							
//
//								String empid =req.getParameter("id");
//								String sql = "select * from employee_info where id =?";
//								out.println("<h1>Employee details</h1>");
//								pstmt = conn.prepareStatement(sql);
//
//								int id = Integer.parseInt(empid);
//								pstmt.setInt(1, id);
//								rs = pstmt.executeQuery(sql);
//
//								out.println("<table borader = '2'>");
//								out.println("<tr>");
//								out.println("<td>id</td>");
//								out.println("<td>name</td>");
//								out.println("<td>salary</td>");
//								out.println("<td>gender</td>");
//								out.println("</tr>");
//
//			
//									if(rs.next()) {
//										int emp_id = rs.getInt("id");
//										int sal = rs.getInt("sal");
//										String name = rs.getString("name");
//										String gender = rs.getString("gender");
//										System.out.println("id :"+emp_id);
//    									System.out.println("name :"+name);
//										System.out.println("salary :"+sal);
//										System.out.println("gender :"+gender);
//
//										out.println("<tr>");
//										out.println("<td>"+id+"</td>");
//										out.println("<td>"+name+"</td>");
//										out.println("<td>"+sal+"</td>");
//										out.println("<td>"+gender+"</td>");
//										out.println("</tr>");
//														}
//									     	}
//
//						catch (Exception e) 
//						{							
//							out.println("class not found");
//						}
//
//
//						finally {
//								try {
//										if(conn!=null)
//											{
//											conn.close();
//											}
//										if(pstmt!=null)
//											{
//												pstmt.close();
//												}
//									}
//						
//
//								catch (Exception e) {
//										out.println("cannot connect db");
//											e.printStackTrace();
//											}
//							
//					               	}
//						}catch(Exception e) {
//							e.printStackTrace();
//						}
//						}
//}