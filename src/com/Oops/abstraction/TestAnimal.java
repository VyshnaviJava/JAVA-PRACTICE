package com.Oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		
		System.out.println("Dog object info***********");
		//Dog object we are storing it into Animal interface : upcasting or abstraction
		// Animal d = new Animal();//cannot instantiate the type Animal
		System.out.println(Animal.ORGANIZATION_Name);
		Animal d= new Dog();
		d.sleep();
		d.sound();
		d.eat();
		d.walk();
		d.hunt();
		d.drink();
		//Actual class static methods we can call by using object reference variables but not
		//interface static methods ,interface static methods we can call only by using interface names
		//This static method of interface Animal can only be accessed as Animal.breath
		//d.breath();
		Animal.breath();
		Animal.hello();;
		
		System.out.println("cat object info***********");
		
		Animal c = new Cat();
		c.sleep();
		c.sound();
		c.eat();
		c.walk();
		d.hunt();
		c.drink();
		Animal.breath();
		
		Animal l = new Lion();
		l.hunt();
		
		

	}

}
