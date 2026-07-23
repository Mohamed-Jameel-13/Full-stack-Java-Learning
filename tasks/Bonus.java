package com.java.tasks;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter experience in years: ");
        int experience = sc.nextInt();

        System.out.println("Enter rating: ");
        int rating = sc.nextInt();

        System.out.println("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        if (experience >= 5) {
            if (rating >= 4) {
                if (attendance >= 95) {
                    System.out.println("Bonus granted");
                } else {
                    System.out.println("No bonus");
                }
            } else {
                System.out.println("No bonus");
            }
        } else {
            System.out.println("No bonus");
        }

        sc.close();
    }
}