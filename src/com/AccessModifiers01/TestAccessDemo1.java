package com.AccessModifiers01;

//Illegal modifier for the class TestAccessDemo1; 
//only public,<default>,strictfp,abstract & final are permitted

// the block scope is : class scope
//if your class is default , blocks scope is also default
// if your class is public , blocks scope is also public
 public class TestAccessDemo1 {
	 
	 static {
		 System.out.println("Static block called from test");
	 }
	 {
		 System.out.println("Instance block called from test");
	 }
	 //protected data members
	 protected int id4 = 1;
	 protected String name4= "rahul";
	 
	 protected void method4() {
		System.out.println("Method 4 called"); 
	 }
	 //public data members
	 public int id3 =45;
	 public String name3 ="rohit";
	 
	 public void method3() {
		 System.out.println("Method3 called");
		 
	 }
	 
	 //default data members
	 //whenever we are not providing any modifier then will consider as the default data members
	 int id2 = 18;
	 String name2 = "Kohli";
	 
	 void method2() {
		 System.out.println("method2 called");
	 }
	
	//private data members(whenever u keep a keyword private for a class level data consider as private data members)
	private int id1 = 7;
	private String name1 = "msd";
	
	
	
	//constructor
	 public TestAccessDemo1(){
		System.out.println("Hello no arg constructor");
	}
	private void method1() {
		System.out.println("method1 called");
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Main method started from test accessdemo1 class");
		
		//Accessing the private data members within the class
		TestAccessDemo1 t1 = new TestAccessDemo1();
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();
		
		//Accessing the default data members within the class
				
				System.out.println(t1.id2);
				System.out.println(t1.name2);
				t1.method2();
				
         //Accessing the public data members within the class
				
				System.out.println(t1.id3);
				System.out.println(t1.name3);
				t1.method3();
         //Accessing the protected data members within the class
				
				System.out.println(t1.id4);
				System.out.println(t1.name4);
				t1.method4();
	}
	//A class inside a class is inner class to work with temporary requirements
	private class TestIn1{
		
	}

}
