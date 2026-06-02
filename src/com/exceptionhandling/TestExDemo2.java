package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		try {
			System.out.println("Intry");
			System.out.println(10/0);
		}catch(Exception ex) {
			System.out.println("Incatch");
		}
		System.out.println("main method ended");

	}

}
