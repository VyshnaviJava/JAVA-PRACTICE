package com.Logicalstatements01.Loops;

public class TestLPDemo24 {

    // WAP to demonstrate continue statement

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}
