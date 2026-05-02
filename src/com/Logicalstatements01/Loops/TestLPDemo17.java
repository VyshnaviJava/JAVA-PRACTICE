package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo17 {

    // WAP to find sum of digits using while loop
    // input: 345 → output: 3+4+5 = 12

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
