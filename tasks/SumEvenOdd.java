package com.java.tasks;
import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int length = 0;
        int evenSum = 0;
        int oddSum = 0;

        while (temp != 0) {
            length++;
            temp = temp / 10;
        }

        int digit = 0;
        int tempforloop = n;

        for (int i = 1; i <= length; i++) {
            digit = tempforloop % 10;
            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }
            tempforloop = tempforloop / 10;
        }

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}