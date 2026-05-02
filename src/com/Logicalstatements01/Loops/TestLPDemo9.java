package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo9 {

    // WAP to print multiplication table based on given number

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter limit: ");
        int n1 = sc.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        System.out.println("Main method ended");

        sc.close();
    }
}