package com.Oops02;

class TestA1{
	int a1 =10;
	void methda() {
		System.out.println("Method A called");
	}
}
class TestB1 extends TestA1 {
	int b1 = 10;
	void methdb() {
		System.out.println("Method B called");
	}
}
class Testc1 extends TestA1 {
	int c1 = 10;
	void methdc() {
		System.out.println("Method c called");
	}
}

public class TestDemo7 {

	public static void main(String[] args) {
		Testc1 t1 = new Testc1();
		System.out.println(t1.a1);
		System.out.println(t1.c1);
		
		TestB1 t2 = new TestB1();
		System.out.println(t2.a1);
		System.out.println(t2.b1);
		
	}

}
