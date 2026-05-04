package com.Arrays;

public class TestArraysDemo11 {

    public static void main(String[] args) {

        // starting main method
        System.out.println("main method started");

        // creating 2D array with 2 rows and 3 columns
        int[][] numbers = new int[2][3];

        // printing array sizes
        System.out.println(numbers.length);      // rows = 2
        System.out.println(numbers[0].length);   // columns = 3
        System.out.println(numbers[1].length);   // columns = 3

        // assigning values
        numbers[0][0] = 101;
        numbers[0][1] = 102;
        numbers[0][2] = 103;

        numbers[1][0] = 104;
        numbers[1][1] = 105;
        numbers[1][2] = 106;

        // printing array using nested loops
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // next line after each row
        }
    }
}