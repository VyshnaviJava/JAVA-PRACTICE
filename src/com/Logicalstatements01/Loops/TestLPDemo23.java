package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo23 {

    // WAP to create calculator using do-while and switch

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String yn;

        do {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter symbol (+, -, *, /): ");
            String symb = sc.next();

            switch (symb) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Invalid symbol");
            }

            System.out.print("Do you want to continue (y/n): ");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        sc.close();
    }
}