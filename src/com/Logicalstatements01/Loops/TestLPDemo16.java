package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo16 {

    // WAP to find count of digits in a number
    // input: 123 → output: 3

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Count of digits: " + count);

        sc.close();
    }
}
