package com.java.basics;
import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a= sc.nextInt();
//		int b = sc.nextInt();
		// if
//		if(a>b) {
//			System.out.println("A is greater");
//		}
		
		// To find even or odd without
		
//		if((a &1)==0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		
//		if((b/2)*2 ==b) {
//			System.out.println("Even");
//		}
		
		String username = sc.nextLine();
		String password = sc.nextLine();
		if(username.equals("admin")) {
			if(password.equals("123")) 
				System.out.println("Loggedin successfully");
			
			else 
				System.out.println("wrong password");
		}
			
		else {
			System.out.println("wrong username");
		}
		
	}

}
