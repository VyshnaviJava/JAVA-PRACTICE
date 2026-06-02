package com.exceptionhandling;

public class TestExDemo11 {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		try {
			System.out.println("In try1");
			try {
				System.out.println("In try2");
				System.out.println(10/0);
			}catch(Exception e) {
				System.err.println("In catch 2");
			}finally {
				System.out.println("In finally2");
			}
			    System.out.println(10/0);
				System.out.println("hello"); 
		}catch(Exception e) {
			
			try {
				System.out.println("In try 3");
				System.out.println(10/0);
	
			}catch (Exception e1) {
				System.err.println("in catch3");
			}finally {
				System.out.println("In finlly 3");
			}
			System.err.println("In catch 1");
		}
		finally {
			try {
				System.out.println("In try 4");
				//System.out.println(10/0);
			}catch (Exception e1) {
				System.err.println("in catch4");
			}finally {
				System.err.println("In finally4");
			}
			System.out.println("In finally1");
		}
System.out.println("Ended");
		
		}
		
		
			}


