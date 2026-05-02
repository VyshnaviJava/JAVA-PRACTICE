package com.Logicalstatements01;

import java.util.Scanner;

public class TestLSDemo12 {

    static String getDayInfo(String day) {

        switch (day) {

            case "monday":
                return "Lazy day";

            case "tuesday":
            case "wednesday":
            case "thursday":
                return "Normal days";

            case "friday":
                return "Weekend mode started";

            case "saturday":
            case "sunday":
                return "Weekend with holidays";

            default:
                return "Entered day invalid";
        }
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day:");
        String day = sc.next();

        System.out.println(getDayInfo(day));

        sc.close();
    }
}
