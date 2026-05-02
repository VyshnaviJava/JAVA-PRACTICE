package com.Arrays;

public class TestArrayDemo10 {
    public static void main(String[] args) {

        // Q) 2D Array (rows & columns representation)

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ended");
    }
}