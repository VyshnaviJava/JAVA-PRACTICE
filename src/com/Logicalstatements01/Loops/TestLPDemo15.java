package com.Logicalstatements01.Loops;

public class TestLPDemo15 {

    // WAP to print "HELLO" using while loop

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main method started");

        int i = 1;

        while (i <= 10) {
            System.out.println("HELLO");
            i++;
            Thread.sleep(100); // delay
        }

        System.out.println("Main method ended");
    }
}
