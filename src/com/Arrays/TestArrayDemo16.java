package com.Arrays;

public class TestArrayDemo16 {

    public static void main(String[] args) {

        // Input array
        int[] arr = {45, 18, 9, 7, 8, 1, 4};

        int temp = 0;

        // Outer loop → iterate each position
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume current index is minimum
            int minIndex = i;

            // Inner loop → find actual minimum element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with current position
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Output
        System.out.println("After Sorting!!");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}