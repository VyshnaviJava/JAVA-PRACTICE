package com.Arrays;

import java.util.Scanner;

public class TestArrayDemo9 {
    public static void main(String[] args) {

        // Q) Print names starting with 'S' and ending with 'A'

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }

        for (String str : arr) {
            String s = str.toLowerCase();

            if (s.startsWith("s") && s.endsWith("a")) {
                System.out.println(str);
            }
        }
    }
}
