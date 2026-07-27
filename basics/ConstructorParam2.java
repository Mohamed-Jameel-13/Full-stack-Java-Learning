package com.java.basics;

public class ConstructorParam2 {
	String name;
	int age;
	
	ConstructorParam2(){
		name="Unknown";
		age=0;
		
	}
	ConstructorParam2(String name){
		this.name=name;
		age=0;
	}
	ConstructorParam2(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age : "+age );
	}
	
	

	public static void main(String[] args) {
		ConstructorParam2 obj=new ConstructorParam2();
		ConstructorParam2 obj1=new ConstructorParam2("Jameel");
		ConstructorParam2 obj2=new ConstructorParam2("Jameel", 21);
		obj.display();
		obj1.display();
		obj2.display();

	}

}


// CONSTRUCTOR OVERLOADING- A multiple parameterized constructor with different parameter list.
// this keyword is used to refer the current instance of the object's field (Variable)