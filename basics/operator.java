package com.java.basics;
import java.util.Scanner;
public class operator {

	public static void main(String[] args) {
			
		//1.Arithmetic operator +, -, *, /, % (remainder)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
//		int sum = a+b;
//		int multiply = a*b;
//		int subtract = a-b;
//		int divide = a/b;
//		int remainder = a%b;
//		
//		System.out.println("Addition: "+sum);
//		System.out.println("Subtraction: "+subtract);
//		System.out.println("multipication: "+multiply);
//		System.out.println("Division: "+divide);
//		System.out.println("Remainder: "+remainder);
//		
//		//Relational operator
//		
//		// ==, !=, <, <=, >, >=
//		
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a<b);
//		System.out.println(a>b);
//		System.out.println(a<=b);
//		System.out.println(a>=b);
//		sc.close();

		// Logical  operator
		//	&& !
		
		//assignment operator
		// =, +=, -=, *=, /=, %=
//		System.out.println(a+=b);
//		System.out.println(a-=b);
//		System.out.println(a*=b);
//		System.out.println(a/=b);
//		System.out.println(a%=b);
//		System.out.println(a=b);
		
		//Increment operaor 
		// 1. PreIncrement
//		int z = 5;
//		System.out.println(++z);
//		//2.PostIncrement
//		System.out.println(z++);
//		
//		//UNARY OPERATOR - work with only one operand
//		//+....positive, ....negative, ++....increment, --decrement, ! logical not
//		System.out.println(a++);
//		System.out.println(--a);
//		
//		//Bitwise operator - works on binary values
//		// &, << - left shift, >> - right shift
//		System.out.println(a&b);
//		
//		//imstanceOf operator --checks object type
//		
//		String name ="Java";
//		System.out.println(name instanceof String); //returns true
//		
//		//Ternary operator
//		// condition ? value1:value2
//		
//		int age = 21;
//		String results = (age>18? "Adult":"others");
//		System.out.println(result);
		
		//max of 2 no
		
		String result = (a>b ? "a is max" : "b is max");
		
		//positive or negative
		String result2 = (a>0 && b>0 ? "Positive": "Negaive");
		System.out.println(result);
		System.out.println(result2);

				sc.close();
				
				
				
		

	}

}
//operators are special symbol used to perform operations on variables and values
//operand is a data , object, or variable or literal value upon which an operator performs an action
//types of operands
//1.Variable - named memory location storing dynamic data
//2.Literals - Hardcoded constant values
//3.Expressions - Nested equations(a+b)*c
//4.Method calls - A method that returns a value can acts as operand