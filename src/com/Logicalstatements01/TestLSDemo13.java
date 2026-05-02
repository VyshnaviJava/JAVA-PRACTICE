package com.Logicalstatements01;

import java.util.Scanner;

public class TestLSDemo13 {

    public static void main(String[] args) {

        System.out.println("Main method started");
        System.out.println("Welcome to vegetable & fruits market");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a category (veg / fruit):");
        String catg = sc.next();

        switch (catg) {

            case "veg":
                System.out.println("Enter an item:");
                String item = sc.next();

                switch (item) {

                    case "tmt":
                        System.out.println("Tomato & the price is 20 per kg");
                        break;

                    case "ptt":
                        System.out.println("Potato & the price is 40 per kg");
                        break;

                    case "drmst":
                        System.out.println("Drumstick & the price is 100 per kg");
                        break;

                    default:
                        System.out.println("Entered item not there");
                }
                break;

            case "fruit":
                System.out.println("Enter item for fruits:");
                String item2 = sc.next();

                switch (item2) {

                    case "mng":
                        System.out.println("Mango");
                        break;

                    case "apl":
                        System.out.println("Apple");
                        break;

                    default:
                        System.out.println("Entered item not available");
                }
                break;

            default:
                System.out.println("Entered category invalid");
        }

        sc.close();
    }
}