	package com.jdbc.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.serviceI.Requirement;

public class EmployeeReq implements Requirement {

	Scanner sc = new Scanner(System.in);

	@Override
	public void createtable() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3308/employee_sc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			String query = "create table Employee(eid int primary key , ename varchar(45), email varchar(45) UNIQUE , city varchar(45))";

			Statement s = con.createStatement();

			s.execute(query);

			con.close();
		}

		catch (ClassNotFoundException e) {

			System.out.println("Class Not Found.");
		}

		catch (Exception e) {

			System.out.println("SQL Exception.");

		}
	}

	@Override
	public void insertData() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3308/employee_sc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("How Many Employee You Want To Insert : ");

			int emp = sc.nextInt();

			for (int i = 1; i <= emp; i++) {

				System.out.println("\n-----------------Employee " + i + " Details-----------------\n");
				System.out.println("Enter Employee ID: ");
				int id = sc.nextInt();

				System.out.println("Enter Employee Name: ");
				String name = sc.next();

				System.out.println("Enter Employee Email Address: ");
				String email = sc.next();

				System.out.println("Enter City: ");
				String city = sc.next();

				String query = "INSERT INTO Employee VALUES(" + id + ",'" + name + "','" + email + "','" + city + "')";

				Statement stm = con.createStatement();

				stm.execute(query);

			}

			con.close();

		}

		catch (ClassNotFoundException e) {

			System.out.println("Class Not Found.");
		}

		catch (Exception e) {

			System.out.println("SQl Exception.");
		}

	}

	@Override
	public void updateData() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3308/employee_sc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("1.Update Id");
			System.out.println("2.Upadte Name");
			System.out.println("3.Update Email");
			System.out.println("4.Update City");

			System.out.println("Enter Your Choise: ");
			int n = sc.nextInt();

			switch (n) {

			case 1:

				System.out.println("Enter New ID: ");
				int nid = sc.nextInt();

				System.out.println("Enter ID to change ID: ");
				int oid = sc.nextInt();

				String query = "update Employee set eid =" + nid + " where eid = " + oid;

				Statement s12 = con.createStatement();

				s12.execute(query);

				break;

			case 2:

				System.out.println("Enter ID to make Changes: ");
				int id = sc.nextInt();

				System.out.println("Enter new name: ");
				String name = sc.next();

				String query1 = "Update Employee set ename = '" + name + "'where eid =  " + id;

				Statement s11 = con.createStatement();

				s11.execute(query1);

				break;

			case 3:

				System.out.println("Enter ID to make Changes: ");
				int id1 = sc.nextInt();

				System.out.println("Enter new Email: ");
				String email = sc.next();

				String query2 = "Update Employee set email = '" + email + "' where eid= " + id1;

				Statement s2 = con.createStatement();

				s2.execute(query2);

				break;

			case 4:

				System.out.println("Enter ID to make Changes: ");
				int id2 = sc.nextInt();

				System.out.println("Enter new City: ");
				String city = sc.next();

				String query3 = "Update Employee set city='" + city + "'where eid= " + id2;

				Statement s = con.createStatement();

				s.execute(query3);

				break;

			default:

				System.out.println("Invalid Choise.");

			}

			con.close();
		}

		catch (ClassNotFoundException e) {

			System.out.println("Class Not Found.");
		}

		catch (Exception e) {

			System.out.println("SQL Exception.");
		}
	}

	@Override
	public void getAllData() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3308/employee_sc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			String query = "select * from Employee";

			Statement stm = con.createStatement();

			ResultSet result = stm.executeQuery(query);

			while (result.next()) {

				int id = result.getInt("eid");
				System.out.println("Employee ID: " + id);

				String name = result.getString("ename");
				System.out.println("Employee Name: " + name);

				String email = result.getString("email");
				System.out.println("Employee Email: " + email);

				String city = result.getString("city");
				System.out.println("City: " + city);

				System.out.println("\n-------------------------------------\n");

			}

			con.close();
		}

		catch (ClassNotFoundException e) {

			System.out.println("ClassNotFoundException");
		}

		catch (Exception e) {

			System.out.println("SQL Exception.");

		}

	}

	@Override
	public void deleteData() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3308/employee_sc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("Enter Id for delete employee record");
			int id = sc.nextInt();

			String query = "delete from Employee where eid =" + id;

			Statement s = con.createStatement();

			s.executeUpdate(query);

			con.close();

		}

		catch (ClassNotFoundException e) {

			System.out.println("Class Not Found.");
		}

		catch (Exception e) {

			System.out.println("SQL Exception.");
		}
	}

	@Override
	public void deleteTable() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3308/employee_sc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			String query = "drop table Employee";

			Statement s = con.createStatement();

			s.execute(query);

			con.close();

		}

		catch (ClassNotFoundException e) {

			System.out.println("Class Not Found");
		}

		catch (Exception e) {

			System.out.println("SQl Exception");
		}

	}

}
