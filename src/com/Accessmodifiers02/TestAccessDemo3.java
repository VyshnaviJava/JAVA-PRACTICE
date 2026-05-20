package com.Accessmodifiers02;

import com.AccessModifiers01.TestAccessDemo1;

//TestAccessDemo1 -->super class
//TestAccessDemo3 -->sub class

public class TestAccessDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		//Eventhough testaccessdemo1 is public,whatever the data we are accessing is default,
		//so default data we cannot access outside of the packages.

		
		 TestAccessDemo1 t1 = new TestAccessDemo1();
		    //System.out.println(t1.id2);
			//System.out.println(t1.name2);
			//t1.method2();
		//Accessing the public data members outside the package
			
			System.out.println(t1.id3);
			System.out.println(t1.name3);
			t1.method3();
			
			
			
		
		 //Accessing the protected data members outside of the packages not possible directly
			//System.out.println(t1,id4);
			//System.out.println(t1.name4);
			//t1.method4();
			TestAccessDemo3 t3 =new TestAccessDemo3();
			System.out.println(t3.id4);
			System.out.println(t3.name4);
			t3.method4();
			
	}

}
