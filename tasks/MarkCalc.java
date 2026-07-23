package com.java.tasks;
import java.util.Scanner;

public class MarkCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 subjects marks: ");

		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int mark4 = sc.nextInt();
		int mark5 = sc.nextInt();
		System.out.println("Total marks: ");

		int total = sc.nextInt();
		
		int totalMarks = mark1+mark2+mark3+mark4+mark5;
		
		int avg = totalMarks/5;
		int percent = (totalMarks/total)*100;
		
		System.out.println("Total marks: "+totalMarks);
		System.out.println("Average: "+avg);
		System.out.println("Percent: "+percent);



	}

}
