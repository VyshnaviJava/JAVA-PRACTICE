package com.Arrays;

public class TestArrayDemo7 {
    public static void main(String[] args) {

        // Q) WAP to print min & max elements from array

        int[] arr = {18, 45, 4, 7, 118};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
