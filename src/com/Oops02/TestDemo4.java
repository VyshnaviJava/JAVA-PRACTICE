package com.Oops02;

class TestA{
    public static void main(String[] args) {
    	final int X =10;
    	//x = 200;//The final local variable x cannot be assigned. 
    	//It must be blank and not using a compound assignment
		System.out.println("From class A");
	}
    void method1() {
    	
    }

}

class TestB extends TestA {
	
     public static void main(String[] args) {
    	 System.out.println("From class B");
	}
     void method() {
    	 
     }

}

public class TestDemo4 {

	public static void main(String[] args) {
		
	}

}
