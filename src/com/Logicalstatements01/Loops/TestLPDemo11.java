package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo11 {

    // WAP to check whether given number is prime or not

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean status = true;

        if (n == 0 || n == 1) {
            status = false;
        }

        for (int i = 2; i < n; i++) {
            // if you take n/2 then i <= n/2 (optional optimization)
            if (n % i == 0) {
                status = false;
                break;
            }
        }

        if (status) {
            System.out.println("The given number is prime");
        } else {
            System.out.println("The given number is not prime");
        }

        System.out.println("Main method ended");

        sc.close();
    }
}