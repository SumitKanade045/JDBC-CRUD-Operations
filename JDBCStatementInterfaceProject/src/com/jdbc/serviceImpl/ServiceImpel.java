package com.jdbc.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.serviceI.Requirement;

public class ServiceImpel implements Requirement{

	@Override
	public void createtable() {
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		String url = "jdbc:mysql://localhost:3308/jdbc_task_db";
		String username = "root";
		String password = "root";
		
		Connection con =DriverManager.getConnection(url,username,password);

		String query = "create table student(rollno  int primary key,name varchar(40),marks float,email varchar(50)Unique)";
		
		 Statement stm = con.createStatement();
		 
		 stm.execute(query);
		 
		 con.close();
		 
		}
		
		catch(ClassNotFoundException e) {
			
			System.out.println("ClassNotFound");
		}
		
		catch(Exception e) {
			
			System.out.println("SQL Exception");
		}
		
	}

	@Override
	public void insertData() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3308/jdbc_task_db";
			String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			String query = "insert into student values(101,'Akash',75.25,'akash@gmail.com'),(102,'Babban',65.25,'babban@gmail.com'),(103,'Chandu',95.25,'chandu@gmail.com'),(104,'Dhanuu',35.25,'dannuu@gmail.com')";
			
			Statement stm = con.createStatement();
			
			stm.execute(query);
			
			con.close();
			
		}
		
		catch(ClassNotFoundException e) {
			
			
			System.out.println("ClassNotFoundException");
		}
		
		catch(Exception e) {
			
			System.out.println("SQL Exception");
		}
		
	}

	@Override
	public void updateData() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3308/jdbc_task_db";
			String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			
			String query = "Update student set name = 'Chandrakant' where rollno = 103";
			
			Statement s = con.createStatement();
			
			s.execute(query);
			
			con.close();
		}
		
		catch(ClassNotFoundException e) {
			
			System.out.println("Class Not Found");
		}
		
		catch(Exception e) {
			
			System.out.println("SQL Exception");
		}
		
	}

	@Override
	public void getAllData() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3308/jdbc_task_db";
			String username = "root";
			String password = "root";
			
		Connection con = DriverManager.getConnection(url,username,password);
		
		String query = "select * from student";
		
		Statement stm = con.createStatement();
		
		ResultSet result = stm.executeQuery(query);
		
		while(result.next()) {
			
			int rollno = result.getInt("rollno");
			float mark = result.getFloat("marks");
			String name = result.getString("name");
			String gmail = result.getString("email");
		

			System.out.println("Student Roll Number is: "+rollno);
			System.out.println("Student Name is: "+name);
			System.out.println("Student Marks is: "+mark);
			System.out.println("Student email is: "+gmail);

			System.out.println("\n----------------------------------------\n");
			
		}
		
		con.close();
		}
		
		catch(ClassNotFoundException e) {
			
			System.out.println("Class Not Found ");
		}
		
		catch(Exception e) {
			
			System.out.println("SQL Exception");
		}
	}

	@Override
	public void deleteData() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3308/jdbc_task_db";
			String username = "root";
			String password = "root";
			
		Connection	con = DriverManager.getConnection(url, username, password);
		
		String query = "delete from student where rollno = 104";
		
		Statement s = con.createStatement();
		
		s.executeUpdate(query);
		
		con.close();
			
		}
		
		catch(ClassNotFoundException e) {
			
			System.out.println("Class Not Found.");
		}
		
		catch(Exception e) {
			
			System.out.println("SQL Exception.");
		}
		
	}

	@Override
	public void deleteTable() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3308/jdbc_task_db";
			String username = "root";
			String password = "root";
			
		Connection con = DriverManager.getConnection(url, username, password);
		
		String query = "drop table student";
		
		Statement s = con.createStatement();
		
		s.execute(query);
		
		
			
		}
		
		catch(ClassNotFoundException e) {
			
			System.out.println("Class Not Found");
		}
		
		catch(Exception e) {
			
			System.out.println("SQl Exception");
		}
	}

}
