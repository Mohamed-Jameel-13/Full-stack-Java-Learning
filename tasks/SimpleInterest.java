package com.java.tasks;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposit: ");

		int deposit=sc.nextInt();
		System.out.println("Enter No of years");

		int noOfYears=sc.nextInt();
		System.out.println("Enter rate of interest");

		double rateOfInterest=sc.nextDouble();
		
			double simpleInterest=deposit*noOfYears*rateOfInterest/100;
			double finalAmount=deposit+simpleInterest;
			
			System.out.println("Simple Interest: "+simpleInterest);
			System.out.println("Total amount: "+finalAmount);

	}

}
