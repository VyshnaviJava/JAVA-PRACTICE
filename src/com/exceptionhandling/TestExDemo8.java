package com.exceptionhandling;

public class TestExDemo8 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		try {
		System.out.println("In try");
		System.out.println(10/0);//AE
		System.out.println(10.5/0);//Infinity
		System.out.println(10.5 / 0.0);//Infinity
		System.out.println(0.0 / 0.0);//NAN not a number
		System.out.println(0/0.0);//NAN not a number
		
		}catch(Exception e) {
			System.err.println("In catch");
			System.err.println(e.getMessage());//Description only
			System.err.println(e.toString());//Name+Description only
			System.out.println(e);// Name+Description only same as tostring
			
		}
		

	}

}
