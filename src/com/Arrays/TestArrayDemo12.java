package com.Arrays;

public class TestArrayDemo12 {

    public static void main(String[] args) {

        // directly initializing 2D array
        int[][] numbers = {
                {10, 20, 30},
                {40, 50}
        };

        // printing elements
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}