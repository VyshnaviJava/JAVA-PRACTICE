package com.AccessModifiers01;


//Note : In java , the default package is java.lang and the current package,
//so we no need to import within the same package classes
public class TestAccessDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		// in testaccessdemo2 can we use object of other class
		//yes.whenever your constructor is private
		TestAccessDemo1 t1 = new TestAccessDemo1();
		
		//Accessing the default data members within the class & outside of the classes
		
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();
		//Accessing the public data members outside the package
		
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		//Accessing the protected data members within the class
		
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();
		
		   //Whenever the data members are private we cannot access outside of the classes
		     //we can access only within the class
		//The constructor TestAccessDemo1() is not visible
		//bcoz in testaccessdemo1 we used private
		//The field TestAccessDemo1.id1 is not visible
		//System.out.println(t1.id1);
		
		//The field TestAccessDemo1.name1 is not visible
        //System.out.println(t1.name1);
        
		//The method method1() from the type TestAccessDemo1 is not visible
        //t1.method1();
	}

}
