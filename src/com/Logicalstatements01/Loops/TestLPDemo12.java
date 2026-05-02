package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo12 {

    // WAP to find factorial of a given number using for loop
    // input: 4
    // output: 4! = 4 x 3 x 2 x 1 = 24

    public static void main(String[] args) {

        int fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial of given number is: " + fact);

        sc.close();
    }
}
