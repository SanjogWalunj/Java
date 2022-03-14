package com.infy.j;
class Employee{
	public static void display(){
		System.out.println("Employee");
	}
}

public class Trainee extends Employee {
	public static void main(String[] args) {
		System.out.println("Welcome");
	
		/*
		 * public static void display(){ System.out.println("Trainee"); } public static
		 * void main(String[] args) { Employee employee = new Trainee();
		 * employee.display(); }
		 */
	}
}
