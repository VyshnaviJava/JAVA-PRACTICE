package com.Arrays;

import java.util.Scanner;

public class TestArrayDemo13 {

    // method to check whether a number is prime
    static boolean isPrime(int a) {

        // 0 and 1 are not prime
        if (a == 0 || a == 1) {
            return false;
        }

        // checking divisibility
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false; // not prime
            }
        }

        return true; // prime number
    }

    public static void main(String[] args) {

        System.out.println("main method");

        // taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements to an array:");

        // reading array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // printing prime numbers
        System.out.println("Prime numbers:");

        for (int a : arr) {
            if (isPrime(a)) {
                System.out.print(a + " ");
            }
        }

        sc.close();
    }
}