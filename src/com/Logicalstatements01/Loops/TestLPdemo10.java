package com.Logicalstatements01.Loops;

public class TestLPdemo10 {

    // WAP to print prime numbers from 0 to 100

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Main method ended");
    }
}
