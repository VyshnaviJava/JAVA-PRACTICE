package com.Arrays;

public class TestSwap {
    public static void main(String[] args) {

        // Q) Swap two numbers using temp variable

        int x = 10;
        int y = 20;

        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("X value: " + x);
        System.out.println("Y value: " + y);

        // Q) Swap without temp variable

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A value: " + a);
        System.out.println("B value: " + b);
    }
}