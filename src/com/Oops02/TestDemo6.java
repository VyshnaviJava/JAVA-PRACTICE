package com.Oops02;

//every class in java extends object class,so we can consider this as implict
//single inheritance
class TestDemoA{
	int a1=100;
	
	void methodA() {
		System.out.println("MethodA called");
	}
}
//single inheritance ,by using child object we can access both parent and child class functionalities
class TestDemoB extends TestDemoA {
     int b1=200;
     int a1 = 300;
	
	void methodB() {
		System.out.println("MethodB called");
		System.out.println(this.a1);
		System.out.println(super.a1);
	}
}

//one class cannot extends multiple classes in java ,so multiple inheritance is not posiible in java
//class TestDemoc extends TestDemoB,TestDemoA{
	class TestDemoc extends TestDemoB{
	
		
int c1=100;
	
	void methodc() {
		System.out.println("Methodc called");
	}
	
}
	

//Driver class
public class TestDemo6 {

	public static void main(String[] args) {
		TestDemoc t = new TestDemoc();
		System.out.println(t.a1);
		System.out.println(t.b1);
		t.methodA();
		t.methodB();
		t.methodc();
		System.out.println(t.toString());
	}

}


