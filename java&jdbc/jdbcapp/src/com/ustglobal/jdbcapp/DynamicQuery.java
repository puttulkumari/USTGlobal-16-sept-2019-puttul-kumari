package com.ustglobal.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class DynamicQuery {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		//for insertion no need result set ref var

		try {
			//1. load the driver----------------------------------------------------------------------------
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//2. get the connection-------------------------------------------------------------------------
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);

			//3.Issue sql query---------------------------------------------------------------------------
			String sql ="insert into employee_info values(?,?,?,?)";

			pstmt = con.prepareStatement(sql);
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

		//5. close all JDBC (Objects) connections-----------------------------------------------------
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
			}

			catch (Exception e) {

				e.printStackTrace();
			}
		}

	}//end of main

}//end of execute insert query



