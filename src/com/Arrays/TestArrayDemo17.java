package com.Arrays;

public class TestArrayDemo17 {

    // Method to reverse array between start and end
    public static void arrayReverse(int[] arr, int start, int end) {

        int temp = 0;

        while (start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Method to rotate array
    public static void arrayRotation(int[] arr, int r) {

        int start = 0;
        int end = arr.length - 1;

        // Step 1: Reverse full array
        arrayReverse(arr, start, end);

        // Step 2: Reverse first part
        arrayReverse(arr, start, r - 1);

        // Step 3: Reverse second part
        arrayReverse(arr, r, end);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int r = 3;

        System.out.println("Before Rotation:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        // Rotate array
        arrayRotation(arr, r);

        System.out.println("\nAfter Rotation:");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}