package com.Arrays;

public class TestArrayDemo15 {

    public static void main(String[] args) {

        System.out.println("main method started");

        // given array
        int[] arr = {30, 40, 20, 15, 5, 2};

        int temp;

        // outer loop for passes
        for (int i = 0; i < arr.length - 1; i++) {

            // inner loop for comparison
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // printing sorted array
        System.out.println("Array : sorted Array");

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}