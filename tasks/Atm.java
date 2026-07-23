package com.java.tasks;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin");
		int pin = sc.nextInt();
		int balance = 12000;
		System.out.println("Enter your amount");

		int amount = sc.nextInt();
		
		if(pin==1234) {
			if(amount<= balance && amount%100==0) {
				System.out.println("Withdrawned successfully");
			}
			else {
				System.out.println("insufficient balance or amount must be multiple of 100");
			}
		}
		else {
			System.out.println("Wrong pin");
		}
	}

}
