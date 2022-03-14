package com.csi.j;
class Employee{
	public void display(){
		System.out.println("display");
	}
	public void print(int age){
		System.out.println("Employee");
	}
}

public class Trainee extends Employee{
public void display (String name){
	System.out.println(name);
}
public int print(int age){
	System.out.println("trainee");
	return age;
}
}
