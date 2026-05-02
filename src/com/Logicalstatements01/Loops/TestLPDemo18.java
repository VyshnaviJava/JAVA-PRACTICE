package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo18 {

    // WAP to reverse a given number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}