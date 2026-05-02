package com.Arrays;

public class TestArrayDemo5 {
    public static void main(String[] args) {

        // Q) WAP to print sum & average of given array

        int[] marks = {61, 62, 58, 45, 72, 63};

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        System.out.println("Sum: " + sum);

        double avg = (double) sum / marks.length;
        System.out.println("Average: " + avg);
    }
}