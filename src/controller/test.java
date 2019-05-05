package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
public static void main(String args[]) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sbajdb","root","Sulochana1552");
	if(con!=null){
		System.out.println("con:"+con);
		System.out.println("connection mysql established");
		System.out.println("============================================");
	}
	else
		System.out.println("connection not established");
			Statement st=con.createStatement();
			String query="insert into ajsb values(101,'ram')";
			int count=st.executeUpdate(query);
			System.out.println("count>>"+count);
			con.close();
	
}
}