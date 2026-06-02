package com.exceptionhandling;

public class TestExDEmo6 {

	public static void main(String[] args) {
		System.out.println("Main method stareted");
		
		try {
			System.out.println("intry");
		String str = "srikanth";
		System.out.println(str.charAt(9));
		
		System.out.println(10/0);
		System.out.println("Hello");
		
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("incatch si e");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("incatch A e");
			e.printStackTrace();
		}
		
		System.out.println("Main method ended");
	}

}
