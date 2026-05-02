package com.Logicalstatements01.Loops;

public class TestLPDemo3 {

    public static void main(String[] args) {

        System.out.println("Even numbers:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}