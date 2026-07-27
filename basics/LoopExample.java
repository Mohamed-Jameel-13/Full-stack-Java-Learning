package com.java.basics;
import java.util.Scanner;
public class LoopExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//EXAMPLE-1
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
		
		//EXAMPLE-2
//		for(int i=10;i>=0;i--) {
//			System.out.println(i);
//		}
//		
//		for (int i=1;i<=5;i++) {
//			System.out.println(i);
//		}
//		for(int j=10;j>=6;j--) {
//			System.out.println(j);
//		}
		
		
		//while loop
		int i=0;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
		
		//do while loop
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<5);
		
		//ENHANCED FOR LOOP - it is used to traverse arrays or collections without using an index
		int [] arr = {3,4,5,2,2,1};
		int sum=0;
		for(int x:arr) {
			sum = sum+x;
			
		}
		System.out.println(sum);
	}

}
//for - it is used when you know how many times you wanna repeat
//while - checks the condition before executing the loop body
//do while - executes the loop body first , then checks the condition and it runs atleast once.
//
//Features-	while													Do while
//						1. Entry controlled loop				1.Exit controlled loop
//Condition check 		2.at the beginiing of the loop			2. At the end of the loop	
//Min iteration			3. zero									3.one (always runs atleast once)
//Variable initialization	4. Must be initialized before the loop  4. Can be initialized before or inside the loop



