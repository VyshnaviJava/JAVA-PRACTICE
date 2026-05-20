package com.Oops02;
interface A{
	public abstract void display();
}
class B implements A{
	@Override
	public void display() {
		System.out.println("Good morning");
	}
}
class C implements A{
	@Override
	public void display() {
		System.out.println("Good evening");
	}
}
//if we extends two classes :CE: Syntax error on tokens, delete these tokens
//class D extends C,B{
class D extends C{
	public static void main(String[] args) {
		D d = new D();
		d.display();
		
	}
}
	


	

public class TestDemo8 {

	public static void main(String[] args) {
		
	}

}
