package com.Oops;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setSid(19);
		s1.setSname("virat");
		s1.setphone(3456678);
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getphone());
		//s1.sid = 18;
		//s1.sname="kohli";
		//s1.phone = 97654477;
		
		//s1.sid =9;
		
		//Accessing the data from outside of the classes directly
		//System.out.println(s1.sid);
		//System.out.println(s1.sname);
		//System.out.println(s1.phone);

	}

}
