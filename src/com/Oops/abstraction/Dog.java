package com.Oops.abstraction;

public class Dog implements Animal {
	
	@Override
	public void sound() {
		System.out.println("Bow bow");
	}

	@Override
	public void walk() {
		System.out.println("Dog runs like anything");
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleeps mrng");
	}

	@Override
	public void eat() {
		System.out.println("dogs eats meats");
		
	}
	@Override
	public void run() {
		System.out.println("dog is nice");
		

}
	//static methods we cannot override but , we can use same static method inside the child classes which is not method overriding will consider as the method hiding
	//static void breath() {
		//System.out.println("Ofc every animal breaths to survive");
	//}
}

