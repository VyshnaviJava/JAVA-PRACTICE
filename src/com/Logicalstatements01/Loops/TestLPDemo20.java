package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo20 {

    // WAP to check whether given number is Armstrong or not
    // Example: 153 → 1³ + 5³ + 3³ = 153

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        while (n != 0) {
            int r = n % 10;
            sum = sum + (r * r * r); // for 3-digit
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("The given number is Armstrong");
        } else {
            System.out.println("The given number is not Armstrong");
        }

        sc.close();
    }
}
