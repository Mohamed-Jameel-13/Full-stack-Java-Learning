package com.java.tasks;
import java.util.Scanner;

public class EbBillCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total units: ");

		int totalUnits = sc.nextInt();
		System.out.println("Enter charge per unit: ");

		double charge = sc.nextDouble();
		System.out.println("Enter fixed Meter Charge: ");

		int fixedmeterCharge= sc.nextInt();
		System.out.println("Enter tax: ");

		byte tax=sc.nextByte();
		
		double total = totalUnits*charge;
		double subtotal = fixedmeterCharge+total;
		
		double finalPay = subtotal+subtotal*tax/100;
		
		System.out.println("Final Pay: "+finalPay);
	}

}
