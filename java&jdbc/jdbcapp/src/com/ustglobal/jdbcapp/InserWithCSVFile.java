package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InserWithCSVFile {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";

		try(
				FileReader in =new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection conn =DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)
				)
		{	
			    while(reader.ready()) 
			    {
					String line =reader.readLine();
					String [] datas = line.split(",");
				int id = Integer.parseInt(datas[0]);
					String name =datas[1];
					int sal = Integer.parseInt(datas[2]);
					String gender =datas[3];
				
					pstmt.setInt(1, id);
					pstmt.setString(2, name);
					pstmt.setInt(3, sal);
					pstmt.setString(4,gender);
				
					// count = pstmt.executeUpdate();
					//stem.out.println(count+"Row(s) inserted");
					pstmt.addBatch();   //store whole data at a time
					
			    }//end of while-loop
	
			    int counts [] = pstmt.executeBatch();
			    System.out.println(counts.length+"row(s) inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}//end of main()
}//end with insert csv file
