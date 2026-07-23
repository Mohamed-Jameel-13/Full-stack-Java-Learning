package com.java.tasks;
import java.util.Scanner;

public class EligiblityCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		double marks = sc.nextDouble();
		System.out.println("Enter your attendance % : ");
		double attendance = sc.nextDouble();
		System.out.println("Enter no of arrears");
		int noOfArrears = sc.nextInt();
		
		if(marks>=85) {
			if(attendance>=90) {
				if(noOfArrears==0) {
					System.out.println("Eligible for scholarship");
				}
				else {
					System.out.println("you must clear all subjects");
				}
				
			}
			else {
				System.out.println("Attendance percentage must be greater than or equal to 90");
			}
		}
		else {
			System.out.println("Marks must be above or equal to 85");
		}
	}
	

}
