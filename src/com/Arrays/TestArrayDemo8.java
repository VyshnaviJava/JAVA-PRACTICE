package com.Arrays;

import java.util.Scanner;

public class TestArrayDemo8 {
    public static void main(String[] args) {

        // Q) WAP to read elements from scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("\nEnded");
    }
}