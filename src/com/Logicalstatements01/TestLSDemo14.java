package com.Logicalstatements01;

import java.util.Scanner;

public class TestLSDemo14 {
    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks percentage: ");
        int marksP = sc.nextInt();

        String result = switch (marksP / 10) {

            case 10, 9 -> {
                yield "Excellent";
            }

            case 8 -> {
                yield "Very Good";
            }

            case 7 -> {
                yield "Average";
            }

            case 6 -> {
                yield "Pass";
            }

            default -> {
                yield "Fail";
            }
        };

        System.out.println("Result: " + result);
    }
}