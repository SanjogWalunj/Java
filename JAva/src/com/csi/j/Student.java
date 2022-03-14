package com.csi.j;
class Person{
	public Person(String name){
		
	}
}

public class Student extends Person {
public Student(){
	System.out.println("student");
}
public static void main(String[] args) {
	new Person("Bob");
}
}
