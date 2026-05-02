package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo14 {

    // WAP to print fibonacci series

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);

        for (int i = 0; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        System.out.println("\nMain method ended");

        sc.close();
    }
}