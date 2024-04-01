package com.edu.inputdata;

import java.util.Scanner;

class Employee{
	//instance variable
	int id;
	String name;
	float salary;
	int age;
	
	void inputEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name=sc.nextLine();
		
		System.out.println("Enter the id: ");
		id=sc.nextInt();
		
		System.out.println("Enter the salary: ");
		salary=sc.nextFloat();
		
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		
	}
	void displayEmployeee() {
		System.out.println("id of Employee: "+id);
		System.out.println("name of Employee: "+name);
		System.out.println("salary of Employee: "+salary);
		System.out.println("age of Employee: "+age);
		
	}
}

public class EmployeeEncapsulation {

	public static void main(String[] args) {
		System.out.println("Main method");

		Employee dataobject = new Employee();
		dataobject.inputEmployee();
		dataobject.displayEmployeee();

	}

}
