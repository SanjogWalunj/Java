package com.infy.j;

public class VaragsTest {
	public static void main(String[] args) {
		new VaragsTest().display(5, "Infosys");
		new VaragsTest().display(4, "Infosys", "Limited");
		 
	}
	public void display (int b,String...strings){
		System.out.println(strings[strings.length-1]+"");
	}

}
