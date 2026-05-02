package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo7 {

    // WAP to check whether given number is perfect or not

    static boolean isPerfect(int n) {

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println("The given number is perfect");
        } else {
            System.out.println("The given number is not perfect");
        }

        System.out.println("Main method ended");

        sc.close();
    }
}
