package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;



public class ExecuteInsertQuery {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		
		//for insertion no need result set ref var

		try {
			//1. load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//2. get the connection
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);

			//3.Issue sql query
			String sql ="insert into employee_info values(26,'ziya',20000,'F')";

			//String sql ="insert into employee_info values("+args[0]+",'"+args[1]+",'"+args[2]+"'"+args[3]+")";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(sql);
		
			

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
								if(stmt!=null)
								{
									stmt.close();
								}
			}

			catch (Exception e) {

				e.printStackTrace();
			}
		}

	}//end of main

}//end of execute insert query
