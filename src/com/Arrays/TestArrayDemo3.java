package com.Arrays;

import java.util.Scanner;

public class TestArrayDemo3 {
    public static void main(String[] args) {

        // Q) Enter size of array and print elements

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Q) Initialize values
        names[0] = "Abhishek";
        names[1] = "Ishan";
        names[2] = "Sanju";
        names[3] = "Tilak";
        names[4] = "Surya";

        // Q) Print array elements
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }
    }
}