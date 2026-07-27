package com.java.basics;

public class Static {
	static String company = "Jd2cv";
	static final String name="Jasim";
	public static void main(String[] args) {
		company="Jameel";
		System.out.println(Static.company);
		System.out.println(Static.name);

	}


}

//Static is a keyword, and mutable by default and can be immutable with final keyword
// Static belongs to the class not to the individual objects
//there is only one copy of the static variable and all object of the class shares it.
//It can be accessed using classname dot variable.