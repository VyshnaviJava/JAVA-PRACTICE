package com.Arrays;

public class TestArrayDemo4 {
    public static void main(String[] args) {

        // Q) Print even numbers using for-each loop

        int[] numbers = {10, 20, 35, 40, 50};

        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
