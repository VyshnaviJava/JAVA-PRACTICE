package com.Oops02;

class Employee{
	int eid;
	double esal;
	
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Finalize method called");
	}
}

public class TestDemo2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println(e1);
		int i = 0x1dbd16a6;
		System.out.println(e1.hashCode());//unique value returns
		System.out.println(i);
		
		Employee e2 = new Employee();
		System.out.println(e2);
		int i1 = 0x7ad041f3;
		System.out.println(e2.hashCode());
		System.out.println(i1);
		
		Employee e3 =e1;
		
		new Employee();
		System.gc();
		
		System.out.println(e1.getClass());//class com.oops02.employee
		
		System.out.println("****************");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
	}

}
