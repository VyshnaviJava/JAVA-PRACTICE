package com.Oops.abstraction;

public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("meow meow");
		
		
	}

	@Override
	public void walk() {
		System.out.println("cat sleeps");
		
	}

	@Override
	public void sleep() {
		System.out.println("cat is waste");
		
	}

	@Override
	public void eat() {
		System.out.println("cat is nice");
		
	}
	@Override
	public void run() {
		System.out.println("cat runs nice");
	}
	//yes default methods we can override but not with the default keyword
	//if we use default keyword in classes will get a CE like:
	// CE : Default methods are allowed only in interfaces
	@Override
	public  void drink() {
		System.out.println("cat drinks milk");
	}
}
