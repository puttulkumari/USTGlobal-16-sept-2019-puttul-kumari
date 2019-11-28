package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class MyFirstJDBC 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//1.LOAD THE DRIVER--------------------------
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);  

			//2. GET THE CONNECTION--------------------------
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//3. ISSUE SQL QUERY----------------------
			stmt = conn.createStatement();
			String sql    ="select * from employee_info";
			rs = stmt.executeQuery(sql);

			//4. READ THE RESULT----------------------
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name =rs.getString("name");
				int sal = rs.getInt("sal");
				String gender =rs.getString("gender");

				System.out.println("id "+id);
				System.out.println("name "+name);
				System.out.println("salary "+sal);
				System.out.println("Gender "+gender);
				System.out.println("************");
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		//5. CLOSE ALL CONNECTION FOR JDBC OBJECT
		finally {
			try {     if(conn!=null)
			{  conn.close(); }
			if(stmt!=null)
			{  conn.close(); }
			if(rs!=null)
			{ rs.close();    }
			}
			catch(SQLException e) {
				e.printStackTrace();
			}  //end of catch
		}    //end of finally
	}      //end of main()
}     //end of my first jdbc
