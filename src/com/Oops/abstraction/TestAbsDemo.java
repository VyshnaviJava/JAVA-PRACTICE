package com.Oops.abstraction;

public abstract class TestAbsDemo implements TestIn1 {
	
   //constructor
	TestAbsDemo(){
		System.out.println("constructor called from TestAbs");
	}
	//normal or concrete method
	public void method6() {
		System.out.println("Method6 called from Abs class");
		
	}
	
	public abstract void method7();
	//override methods

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

}
