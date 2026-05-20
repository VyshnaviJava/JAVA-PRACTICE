package com.Oops03;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("Main method strated");
		
		TestDemo6 t = new TestDemo6();
		t.add();
		t.add(10);
		t.add(10,20);
		t.add(10,20,30);
		t.add(10,20,30,40);
		t.add(10,20,30,40);
		t.add(10,20,30,40,50);
		

	}
	//var arg method
	void add(int...values) {
		int sum =0;
		for(int i :values) {
			sum =sum + i;
		}
		System.out.println("sum : " + sum);
		}
	}
	//void add() {
		//System.out.println("no args called");
	//}
	//void add(int a) {
		//System.out.println(a);
	//}
	//void add(int a,int b) {
		//System.out.println(a+b);
	//}
	//void add(int a,int b,int c) {
		//System.out.println(a+b+c);
	//}
	//void add(int a,int b,int c,int d) {
		//System.out.println(a+b+c+d);
	//}
	//void add(int a,int b,int c,int d,int e) {
		//System.out.println(a+b+c+d+e);
	//}

//}
