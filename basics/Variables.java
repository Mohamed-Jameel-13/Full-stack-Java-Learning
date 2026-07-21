package com.java.basics;

public class Variables {
	public void displayAge() {
		int age = 21;
		System.out.println(age);
	}

	public static void main(String[] args) {
		//Declared inside a method
//		local variable
//		- it is accessible only within the method of block
//		- must be initialized before use
	
		Variables obj = new Variables();
		obj.displayAge();
		
		
	}

}
