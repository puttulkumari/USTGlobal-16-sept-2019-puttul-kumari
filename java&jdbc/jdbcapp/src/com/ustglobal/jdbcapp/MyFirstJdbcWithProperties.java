package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import com.mysql.jdbc.Driver;
public class MyFirstJdbcWithProperties 
	{
		public static void main(String[] args) 
		{

			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			FileReader  reader= null;

			try {
				  reader =new FileReader("db.properties");
				  Properties prop = new Properties();
				  prop.load(reader);
				
				
				 //1.LOAD THE DRIVER--------------------------
					Class.forName(prop.getProperty("driver-class-name"));
				//2. GET THE CONNECTION--------------------------
				String url = prop.getProperty("url");
				conn = DriverManager.getConnection(url,prop);
				
				//3. ISSUE SQL QUERY----------------------
				stmt = conn.createStatement();
				String sql =prop.getProperty("select-query");
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
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			//5. CLOSE ALL CONNECTION FOR JDBC OBJECT
			finally {
				try {
					if(conn!=null)
					{conn.close();
					}
					if(stmt!=null)
					{conn.close();
					}

					if(reader!=null)
					{reader.close();
					}
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}
		}      //end of main()
	}//end of my first jdbc

