package com.Arrays;

import java.util.HashSet;
import java.util.Set;

public class TestArrayDemo19 {

    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 1, 2};

        // Set to store unique elements
        Set<Integer> set = new HashSet<>();

        // Set to store duplicate elements
        Set<Integer> duplicates = new HashSet<>();

        // Traverse array
        for (int a : arr) {

            // If element already exists → it's duplicate
            if (!set.add(a)) {
                duplicates.add(a);
            }
        }

        // Print duplicates
        System.out.println("Duplicate elements are:");
        System.out.println(duplicates);
    }
}