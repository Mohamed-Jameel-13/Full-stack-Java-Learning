package com.java.tasks;
import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String username = sc.nextLine();
		System.out.println("Enter your password: ");

		String password = sc.nextLine();
		System.out.println("Enter your otp: ");

		int otp = sc.nextInt();
		
		if(username.equals("admin")) {
			if(password.equals("123")) {
				if(otp==1234) {
					System.out.println("Loggedin successfully");
				}
				else {
					System.out.println("Invalid otp");
				}
			}
			else {
				System.out.println("Wrong password");
			}
		}
		else {
			System.out.println("Wrong username");
		}
		sc.close();
	}

}
