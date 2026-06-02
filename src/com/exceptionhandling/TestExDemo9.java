package com.exceptionhandling;

import java.util.Scanner;
public class TestExDemo9 {

	//In java finally block excutes whether there is a problem or not
	//Mainly we use finally block for closing the connections or resources.
	//ex:scanner , connection file related classes.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		try {
			System.out.println("In try");
			System.out.println(10/0);
			
		}catch(Exception e) {
			System.out.println("In catch");
			
		}finally {
			System.out.println("In finally");
			sc.close();
			
		}

	}

}
