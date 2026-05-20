package com.Oops02;

class Customer{
	String cname;
	int age;
	
	@Override
	public String toString() {
		return "Customer info : [Name = " + cname + "Age : " + age +"]";
	}
}

public class TestDemo3 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println(c1);
	}

}
