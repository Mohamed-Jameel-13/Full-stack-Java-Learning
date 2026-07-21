//package com.java.basics;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur age");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.println("enter ur name");
		String name =sc.nextLine();
		System.out.println(age);
		System.out.println(name);

		sc.close();
	}
}

//next() --> Read single word
//nextLine()--> read a complete line


