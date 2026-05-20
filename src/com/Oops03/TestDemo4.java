package com.Oops03;

//byte short int long float double
public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo4 t = new TestDemo4();
		t.addition();
		t.addition(10);
		t.addition(10,20);
	}
	void addition() {
		System.out.println("no args :");
	}
	void addition(int a) {
		System.out.println("one int arg method called " + a);
	}
	void addition(float a) {
		System.out.println("one float arg method called " + a);
	}
	void addition(int a , int b) {
		System.out.println("two arg method called " +(a+b));
	}
}
