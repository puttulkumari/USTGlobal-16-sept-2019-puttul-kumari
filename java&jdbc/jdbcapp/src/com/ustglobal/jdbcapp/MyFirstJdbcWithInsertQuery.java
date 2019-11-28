package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

class MyFirstJdbcWithInsertQuery{

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		FileReader  reader= null;
		PreparedStatement pstmt=null;

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
			
			String sql =prop.getProperty("insert-query");
	
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);

			String name = args[1];
			pstmt.setString(2, name);

			String empsal= args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3,sal);

			String gender = args[3];
			pstmt.setString(4, gender);
			int count = pstmt.executeUpdate();

			//4. Read the result set

			System.out.println(count+" Row(s) inserted");
		     }
		     catch (Exception e) {
		      	e.printStackTrace();
		        }
		//5. CLOSE ALL CONNECTION FOR JDBC OBJECT
		finally {
			try {
				if(conn!=null)
				{conn.close();
				}
				if(pstmt!=null)
				{pstmt.close();
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
