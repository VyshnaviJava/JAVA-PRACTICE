package com.exceptionhandling;

//In java try with finally is possible just for closing resources and connections
//but not for graceful termination of the code.
//if the code should be graceful termination means,we should use catch block,
//without catch block we cant except graceful termination if something went wrong in your code.

public class TestExDemo10 {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		try {
			System.out.println("In try");
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("in catch");
		}finally {
			System.out.println("In finally");
		}
		
		
	//after try finally we cannot use catch block
	//Try-catch-finally order must follow	
		
		//catch(Exception e) {
			//System.out.println("in catch");
		//}
		
		System.out.println("Main ended");
	}

}
