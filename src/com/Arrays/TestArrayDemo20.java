package com.Arrays;

public class TestArrayDemo20 {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};

        int temp, j;

        // Start from second element
        for (int i = 1; i < arr.length; i++) {

            temp = arr[i];   // current value
            j = i;

            // Shift elements greater than temp
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }

            // Place temp in correct position
            arr[j] = temp;
        }

        // Output sorted array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}