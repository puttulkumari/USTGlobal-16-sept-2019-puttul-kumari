package com.ustglobal.webapp.servlets;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	public class DynamicQuery {
		public static void main(String[] args) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				
				//1. load the driver
			
				Class.forName("com.mysql.jdbc.Driver");
			//2. get the connection
		
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//3. Issue in sql Query
			String sql = "select * from employee_info where id =?";
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			//4. read the result
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				System.out.println("id :"+emp_id);
				System.out.println("name :"+name);
				System.out.println("salary :"+sal);
				System.out.println("gender :"+gender);
			}
			
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					if(conn!=null)
					{
						conn.close();
					}
					if(pstmt!=null)
					{
						pstmt.close();
					}
				}
				
				catch (Exception e) {

					e.printStackTrace();
				}
				}
		}

	}
