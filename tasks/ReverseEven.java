package com.java.tasks;
import java.util.*;
public class ReverseEven {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num =sc.nextInt();
		int temp =num;
		int length=0;
		int digit =0;
		int rev=0;
		int tempforloop=num;
		while(temp!=0) {
			length++;
			temp/=10;
			
		}
		
		for(int i=1;i<=length;i++) {
			digit =tempforloop%10;
			if(digit%2==0) {
				rev=rev*10+digit;
			}
			tempforloop /=10;
		}
		System.out.println("reversed even numbers: "+rev);
	}
}
