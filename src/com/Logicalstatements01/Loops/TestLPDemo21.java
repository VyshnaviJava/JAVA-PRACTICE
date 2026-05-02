package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo21 {

    // WAP to convert decimal number to binary
    // input: 10 → output: 1010

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String binary = "";

        while (n > 0) {
            int r = n % 2;
            binary = r + binary;
            n = n / 2;
        }

        System.out.println("Binary number is: " + binary);

        sc.close();
    }
}