package com.java.basics;

public class CopyConstructor {
	int id;
	String name;
	
	CopyConstructor(String name, int id){
		this.name = name;
		this.id=id;
		
	}
	CopyConstructor(CopyConstructor obj){
		this.name =obj.name;
		this.id =obj.id;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		CopyConstructor obj= new CopyConstructor("Jameel", 1);
		CopyConstructor obj1= new CopyConstructor("Jasim", 2);
		obj.display();
		obj1.display();
		
	}

}
//JAVA does not provide built in copy Constructor but you can create them

//Can a constructor be private?
//Ans: private only for singleton class 
//Can a constructor be static?

//Purpose of this keyword?
//diff bw method and constructor?
//Can constructor be inherited?
//Ans: cannot be inherited
//Can constructor can be overloaded?
//What happens if you dont write any constructor?
