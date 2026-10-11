package com.jdbc.client;

import java.util.Scanner;

import com.jdbc.serviceI.Requirement;
import com.jdbc.serviceImpl.EmployeeReq;
import com.jdbc.serviceImpl.ServiceImpel;

public class EmployeeTest {

	public static void main(String[] args) {

		Requirement r = new EmployeeReq();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.Create Table." + "\n2.Insert Data." + "\n3.Update Data." + "\n4.Get All Data."
					+ "\n5.Delete Data." + "\n6.Delete Table.\n");

			System.out.println("Enter Your Choise: ");

			int n = sc.nextInt();

			switch (n) {

			case 1:

				r.createtable();
				break;

			case 2:

				r.insertData();
				break;

			case 3:

				r.updateData();
				break;

			case 4:

				r.getAllData();
				break;

			case 5:

				r.deleteData();
				break;

			case 6:

				r.deleteTable();
				break;

			default:

				System.out.println("Enter Valid Choise!");

			}
		}
	}
}
