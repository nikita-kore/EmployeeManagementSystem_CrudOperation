package com.empmanagementapplication;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

	// USE COLLECTION
	HashSet<Employee> empset = new HashSet<Employee>();

	Employee emp1 = new Employee(1, "Nikita", 24, "Developer", "IT", 25000);
	Employee emp2 = new Employee(2, "Shital", 23, "Tester", "CO", 30000);
	Employee emp3 = new Employee(3, "Neha", 40, "Devops Eng", "Admin", 40000);
	Employee emp4 = new Employee(4, "Shweta", 36, "System Eng", "CO", 20000);

	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;

	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);

	}

	/* VIEW ALL EMPLOYEES */

	public void viewAllEmps() {
		for (Employee emp : empset) {
			boolean found = false;
			System.out.println(emp);
		}
	}

	/* VIEW EMPLOYEES BASED ON THERE ID */

	public void viewEmp() {
		System.out.println("\nEnter ID :");
		id = sc.nextInt();
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}

		}
		if (!found) {
			System.err.println("\nEmployee Id is not present...?");
		}
	}

	/* UPDATE THE EMPLOYEE */

	public void UpdateEmployee() {
		System.out.println("Enter ID :");
		id = sc.nextInt();
		boolean found = false;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println("Enter name :");
				name = sc.next();
				System.out.println("Enter new Salary :");
				sal = sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("\n*************Updated Details of Employee Are ******************\n");
				System.out.println(emp);
				found = true;
			}
		}
		if (!found) {
			System.err.println("\nEmployee is Not present");
		} else {
			System.out.println("\nEmployee Details Updated successfully...");
		}
	}

	/* DELETE EMPLOYEE */

	public void deleteEmp() {
		System.out.println("\nEnter id :");
		id = sc.nextInt();
		boolean found = false;
		Employee empdelete = null;

		for (Employee emp : empset) {
			if (emp.getId() == id) {
				empdelete = emp;
				found = true;

			}
		}
		if (!found) {
			System.err.println("\nEmployee Is not Presnt");
		} else {
			empset.remove(empdelete);
			System.out.println("\n*************Employee deleted successfully ....!");
		}
	}

	/* FIND EMPLOYEES BETWEEN AGE 20 AND 30 */
	public void findAgeBetween20And30Employees() {
		boolean found = false;

		for (Employee emp : empset) {
			int age = emp.getAge();
			if (age >= 20 && age <= 30) {
				System.out.println(emp);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No employees found between age 20 and 30");
		}
	}

	/* ADD EMPLOYEE */

	public void addEmp() {
		System.out.println("\nEnter ID:");
		id = sc.nextInt();
		System.out.println("Enter name :");
		name = sc.next();
		System.out.println("Enter Age :");
		age = sc.nextInt();
		System.out.println("Enter Desiganation :");
		desiganation = sc.next();
		System.out.println("Enter Department :");
		department = sc.next();
		System.out.println("Enter The Salary :");
		sal = sc.nextDouble();

		Employee emp = new Employee(id, name, age, desiganation, department, sal);
		empset.add(emp);

		System.out.println(emp);
		System.out.println("\n******************Employee addeed sucessfully ");

	}

}