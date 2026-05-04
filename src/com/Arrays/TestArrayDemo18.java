package com.Arrays;

public class TestArrayDemo18 {

    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 1, 2};

        System.out.println("Duplicate elements are:");

        // Compare each element with others
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                // If duplicate found
                if (arr[i] == arr[j]) {

                    System.out.print(arr[i] + " ");
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }
}