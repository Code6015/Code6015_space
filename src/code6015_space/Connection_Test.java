package code6015_space;

import java.sql.*;


public class Connection_Test {

	public static void main(String[] args) {
		
		String Url;
		// TODO Auto-generated method stub
		
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection("url","user","pwd");
			System.out.println("Connection Established");
			
			//To Do all query
			
			con.close();
			
		}
		
		catch(ClassNotFoundException e) {
			
			System.out.println("Driver Not Found");		
			}
		catch(SQLException e) {
			
			System.out.println("Connection not established");
		}
		

	}

}
