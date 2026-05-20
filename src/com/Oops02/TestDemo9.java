package com.Oops02;

class Parent{
	Parent(){
		System.out.println("Parent constructor called");
	}
}
class Child extends Parent{
	Child(){
		System.out.println(" child constructor called");
	}
}
class Subchild extends Child{
	Subchild(){
		System.out.println("sub child constructor called");
	}
}

public class TestDemo9 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Subchild s1 = new Subchild();

	}

}
