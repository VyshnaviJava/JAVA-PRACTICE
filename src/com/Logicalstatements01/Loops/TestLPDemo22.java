package com.Logicalstatements01.Loops;

import java.util.Scanner;

public class TestLPDemo22 {

    // WAP to restrict login only for 3 attempts

    public static void main(String[] args) {

        String username = "admin";
        String password = "Admin#123";

        int attempts = 0;

        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {

            System.out.print("Enter username: ");
            String user = sc.next();

            System.out.print("Enter password: ");
            String pass = sc.next();

            if (user.equalsIgnoreCase(username) && pass.equals(password)) {
                System.out.println("Login success");
                break;
            } else {
                System.out.println("Invalid credentials");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("Account locked for 24 hrs");
        }

        sc.close();
    }
}
