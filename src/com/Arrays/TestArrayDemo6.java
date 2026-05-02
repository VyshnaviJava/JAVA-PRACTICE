package com.Arrays;

public class TestArrayDemo6 {
    public static void main(String[] args) {

        // Q) WAP to print array in reverse order

        int[] arr = {9, 8, 7, 16, 15};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
