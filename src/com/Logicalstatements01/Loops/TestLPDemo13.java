package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo13 {

    // WAP to find factorial of a given number using recursion

    static int findFact(int n) {

        if (n == 1) {
            return 1;
        }

        return n * findFact(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int f = findFact(n);

        System.out.println("Factorial of given number is: " + f);

        sc.close();
    }
}
