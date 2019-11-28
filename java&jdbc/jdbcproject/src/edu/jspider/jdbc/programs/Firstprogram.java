package edu.jspider.jdbc.programs;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Firstprogram
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt  = null;
		ResultSet rs = null;
	
		
		
		try {
			//load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver); 
			
		//get the connection via loaded drivers
		String dbUr1="jdbc:mysql://localhost:3306/hjem20_db?user=root&password=root";
		con= DriverManager.getConnection(dbUr1);
		
		//issues in sql query
		String query="select * from student_info";
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		
		//process the result after execution of sql queries
		while(rs.next())
		{System.out.println("student_id=" +rs.getInt(1));
		System.out.println("first_name=" +rs.getString(2));
		System.out.println("last_name" +rs.getString(3));
		System.out.println("marks" +rs.getDouble(4));
		System.out.println("----------------------------------");
		}
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
			finally {
				if(rs!=null)
				{
					try {
						rs.close();
					}
					catch(SQLException e){
						e.printStackTrace();
					}
				}
				if(stmt!=null)
				{
					try {
						stmt.close();
					}
					catch(SQLException e){
						e.printStackTrace();
					}
					
					
					if(con!=null)
					{
						try {
							con.close();
						}
						catch(SQLException e){
							e.printStackTrace();
						}
				}
				}
			}
	}
}
