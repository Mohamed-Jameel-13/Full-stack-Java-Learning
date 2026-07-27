package com.java.basics;

class Student {
	// it must have same name as class name
	//does not have any return type 
	//Definition: A constructor is a special method used to initialize a newly created object
	// It is called automatically when an object is created
	// There are three types of constructor
	//1. Default Constructor -  Java compiler automatically generates a constructor and sets primitive instance variable to their default values, 0 for numbers and null for objects
	//2. Parameterized - A constructor with parameters is called parameterized constructor
	//3. It accepts arguments to initialize instance variable with custom value at the  time of object creation
	
	String name;
	int age;
	
	Student(String n, int a){
		name =n;
		age=a;
	}
	
public class ConstructorParameter{
	public static void main(String[] args) {
		Student s1 = new Student("Jameel",21);
		Student s2 = new Student("Jasim",22);
		
		System.out.println(s1.name+ " " +s1.age);
		System.out.println(s2.name+" " +s2.age);
		
	}

}
}