package com.Logicalstatements01;

import java.util.Scanner;

// WAP to calculate the values using switch case
public class TestLSDemo10 {

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();

        System.out.println("Enter b number");
        int b = sc.nextInt();

        System.out.println("Enter a symbol to proceed for calculation:");
        String symb = sc.next();

        switch (symb) {

            case "+":
                System.out.println(a + b);
                System.out.println("addition");
                break;

            case "-":
                System.out.println("subtraction");
                System.out.println(a - b);
                break;

            case "*":
                System.out.println("multiplication");
                System.out.println(a * b);
                break;

            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
	
