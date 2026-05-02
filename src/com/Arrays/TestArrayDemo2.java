package com.Arrays;

public class TestArrayDemo2 {
    public static void main(String[] args) {

        // Q) What is the max size you can take?
        // Answer: 2147483647 (Integer.MAX_VALUE)

        // Q) Declaration + Creation in single line
        int[] numbers = new int[5];

        // Q) Initialize array elements
        numbers[0] = 101;
        numbers[1] = 103;
        numbers[2] = 105;
        numbers[3] = 106;
        numbers[4] = 109;

        // Q) Print index and values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index: " + i);
            System.out.println("Value: " + numbers[i]);
        }
    }
}