package com.ustglobal.curdoperationwithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DeleteWithPrepared {

		public static void main(String[] args) {

			Connection conn= null;
			Statement stmt = null;

			try {

				//1. load the driver
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);

				//2.Get the connection
				String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				conn = DriverManager.getConnection(url);

				//3.Issue sql query
				String sql ="delete from employee_info where id=3";
				stmt = conn.createStatement();
				int count = stmt.executeUpdate(sql);

				//4. Read the result set
				System.out.println(count+" Row(s) deleted");
			   }
		 catch (SQLException e) 
			   { 
			    	e.printStackTrace();
			   }

			//5. close all JDBC (Objects) connections
		finally {
				try {
					if(conn!=null)
					{
						conn.close();
					}
					if(stmt!=null)
					{
						stmt.close();
					}
				}

				catch (Exception e) 
				    {

						e.printStackTrace();
					}
				
		}

			}//end of main

		}//end of execute insert query

