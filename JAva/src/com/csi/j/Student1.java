package com.csi.j;
abstract class Person1{
	public void display(){
		System.out.println("dispaly method in person");
	}
	public static void main(String[] args) {
		
		
		Person1 person = new Student1();
		person.display();
	}
} 


public class Student1 extends Person1 {
public void display(){
	System.out.println("Dispaly ");
}
}
