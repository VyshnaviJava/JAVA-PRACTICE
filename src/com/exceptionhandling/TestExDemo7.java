package com.exceptionhandling;

public class TestExDemo7 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		try {
			System.out.println("Intry");
			System.out.println(10/2);
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException | ArithmeticException e) {
			System.err.println("Incatch" + e.getMessage());
			System.err.println("Incatch" + e.toString());
			System.out.println(e);
		}
		System.out.println("main method ended");
	}

}
