package com.java.basics;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		int balance = 12000;
		int amount = sc.nextInt();
		
		if(pin==1234) {
			if(amount<= balance) {
				System.out.println("Withdrawned successfully");
			}
			else {
				System.out.println("insufficient balance");
			}
		}
		else {
			System.out.println("Wrong pin");
		}
		
		//Dangling else - it occurs when an else statement can be associated with morethan one if
		// Note: In java, the else is always matched with the nearest unmatched if
		
//		int marks = sc.nextInt();
//		if(marks>90) {
//			System.out.println("A-grade");
//		}
//		else if(marks>80) {
//			System.out.println("B-grade");
//		}
//		else if(marks>=60 ) {
//			System.out.println("C-grade");
//		}
//		else {
//			System.out.println("Fail");
//		}
//		
//		int age = sc.nextInt();
//		boolean hasLicense = true;
		
		
		// the SWITCH STATEMENT select one block of code from multiple option based on the value of an expression
		
		int num = 2;
		switch(num) {
		case 1:
			
		}
	}

}



//if else if ladder is used when multiple conditions need to be checked 

//NESTED IF
//nested if means one if statement is placed inside another if statement
//NOTE: It is used when the second condition should only be checked if the first one is true


