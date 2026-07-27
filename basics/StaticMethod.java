package com.java.basics;

public class StaticMethod {
	
	static int add(int a, int b) {
		return a+b;
	}
	static int multiply(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		int sum = StaticMethod.add(5, 3);
		int multi= StaticMethod.multiply(23, 10);
		System.out.println(sum);
		System.out.println(multi);
		
	}

}
