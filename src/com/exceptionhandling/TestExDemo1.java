package com.exceptionhandling;

import java.util.Scanner;
public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = sc.nextInt();//10
		
		System.out.println("Enter b number");
		int b = sc.nextInt();//5
		
		try {
			System.out.println("In try");
			System.out.println(a/b);
		}catch(Exception ex) {
			System.out.println("In catch");
			System.err.println("we should not enter zeros");
		}
		
		System.out.println("Main method ended");
	}

}
