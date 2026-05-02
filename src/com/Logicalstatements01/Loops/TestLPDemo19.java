package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo19 {

    // WAP to check whether number is palindrome or not

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println("Reversed number: " + rev);

        if (temp == rev) {
            System.out.println("The given number is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
