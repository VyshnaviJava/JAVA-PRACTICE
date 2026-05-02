package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo4 {

    public static void findFactors(int n) {

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        findFactors(n);

        sc.close();
    }
}