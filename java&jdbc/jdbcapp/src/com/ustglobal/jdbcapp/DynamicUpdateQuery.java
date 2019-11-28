package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt =null;
		//for update no need result set ref var

		try {
			//1. load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//2. get the connection
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);

			//3.Issue sql query
			String sql ="update employee_info set name=?,sal=?,gender=? where id=?";
			pstmt = con.prepareStatement(sql);

			String emp_id =args[0];
			int id = Integer.parseInt(emp_id);

			String name =args[1];

			String empsal =args[2];
			int sal = Integer.parseInt(empsal);

			String gender =args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);


			int count = pstmt.executeUpdate(); //do not pass sql

			//4. Read the result set

			System.out.println(count+" Row(s) inserted");
		}
		catch (SQLException e) {
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
