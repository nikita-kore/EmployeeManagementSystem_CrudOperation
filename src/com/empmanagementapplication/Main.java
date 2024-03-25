package com.empmanagementapplication;

import java.util.Scanner;

public class Main {

	EmployeeService service = new EmployeeService();
	static boolean ordering = true;

	public static void menu() {
		System.out.println("\n>>>>>>>>>>>>>>>>>> WELCOME TO EMPLOYEE MANAGEMENT SYSTEM <<<<<<<<<<<<<<<<<<\n"
				+ "\n1.Add Employee"
				+ "\n2.View Employee" 
				+ "\n3.Update Employee" 
				+ "\n4.Delete Employee"
				+ "\n5.View All Employee" 
				+ "\n6.View Age betweetween" 
				+ "\n7.Exit");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();

		do {
			/* Call The Menu Method */
			menu();
			System.out.println("\n _____________ ENTER YOUR CHOICE ______________");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add Employee\n");
				service.addEmp();
				break;
			case 2:
				System.out.println("View  Employee\n");
				service.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee\n");
				service.UpdateEmployee();
				break;
			case 4:
				System.out.println("Delete Employee\n");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("View All  Employee\n");
				service.viewAllEmps();
				break;

			case 6:
				System.out.println("View Employee age between ");
				service.findAgeBetween20And30Employees();
				break;
			case 7:
				System.out.println("\n>>>>>>>>>>>>>>>THANK YOU FROM USING APPLICATION......!!");
				System.exit(0);
				break;
			default:
				System.err.println("\nPlease Enter Vaild Choice");

			}

		} while (ordering);

	}

}
