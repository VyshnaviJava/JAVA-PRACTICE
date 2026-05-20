package com.Oops.abstraction;

public interface Animal {
	
	public static final String ORGANIZATION_Name ="VCube";
	
	public abstract void sound();
	
	public abstract void walk();
	
	public abstract void sleep();
	
	public abstract void eat();
	
	public void run();
	//default methods introduced from java8 to avoid backward compatibility problems.
	//yes . we can override default methods in classes,with out default keyword
	// by default methods we can achieve default behaviour for the classes.
	
	public default void hunt() {
		System.out.println("By default every animal");
	}
	
	public default void drink() {
	System.out.println("every animal drinks");
	}
	//static methods introduced from java8 to avoid "Backward compatibility problems
	//But we cannot override static methods in classes
	//static methods are introducing to provide utility behaviour or constant behaviour
	//which we cannot change later or override the functinalities
	public static void breath() {
		System.out.println("Ofc every animal breaths to survive");
	}
	public static void hello() {
		System.out.println("gd afternoon");
	}
	public static void main(String[]args) {
		System.out.println("Main method");
		hello();
		
	}
	//private methods are helping in interfaces to avoid duplicate code from default methods
	private void welcome() {
		System.out.println("WElcome");
	}

		
	
}
