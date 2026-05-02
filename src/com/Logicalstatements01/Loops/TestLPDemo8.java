package com.Logicalstatements01.Loops;

public class TestLPDemo8 {

    // WAP to print sum of first 5 numbers using for loop

    public static void main(String[] args) {

        System.out.println("Main method started");

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of all values: " + sum);

        System.out.println("Main method ended");
    }
}
