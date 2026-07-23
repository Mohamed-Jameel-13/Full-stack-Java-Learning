package com.java.tasks;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		int salary = sc.nextInt();
        System.out.print("Enter HRA Percentage: ");

		byte hra_percent = sc.nextByte();
        System.out.print("Enter DA Percentage: ");

		byte da_percent =sc.nextByte();
        System.out.print("Enter PF Percentage: ");

		byte pf_percent = sc.nextByte();
		int hra = salary*hra_percent/100;
		int da = salary*da_percent/100;
		int pf = salary*pf_percent/100;
		
		int gross_Salary = salary+hra+da;
		int net_Salary = gross_Salary-pf;
		System.out.println("Gross Salary: "+gross_Salary);
		System.out.println("Net Salary: "+net_Salary);
	
	}

}
