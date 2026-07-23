package com.java.tasks;
import java.util.Scanner;
public class FinalPay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter product1 price: ");
		int p1_price = sc.nextInt();
		System.out.print("Enter product2 price: ");

		int p2_price = sc.nextInt();
		System.out.print("Enter product3 price: ");
		int p3_price = sc.nextInt();
		
		byte gst =18;
		System.out.print("Enter discount percent: ");

		byte discount = sc.nextByte();
		
		int discount_price= (p1_price+p2_price+p3_price)*discount/100;
		int after_discount= p1_price+p2_price+p3_price - discount_price;
		int finalpay = after_discount+after_discount*gst/100;
		
		System.out.println("Final pay: "+finalpay);
		
		
		
	}

}
