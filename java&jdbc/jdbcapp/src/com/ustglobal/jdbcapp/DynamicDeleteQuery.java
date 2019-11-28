package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

	public class DynamicDeleteQuery {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt =null;
		//for update no need result set ref var

		try {
			//1. load the driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");

			//2. get the connection
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);

			//3.Issue sql query
			String sql ="delete from employee_info  where id=?";
			pstmt = con.prepareStatement(sql);

			//String emp_id =args[0];
			//int id = Integer.parseInt(emp_id);
			//pstmt.setInt(1, id);
			pstmt.setInt(1, Integer.parseInt(args[0]));


			int count = pstmt.executeUpdate(); //do not pass sql

			//4. Read the result set

			System.out.println(count+" Row(s) inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		//5. close all JDBC (Objects) connections
		finally {
			try {
				if(con!=null)
				{
					con.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

	}//end of main

}//end of execute insert query
