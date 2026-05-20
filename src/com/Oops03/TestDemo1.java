package com.Oops03;

public class TestDemo1 {
	
	static String welcome() {
		return "good mrng";
	}
	static String welcome(String str) {
		return str;
	}
	//Duplicate method welcome() in type TestDemo1
	//object welcome(){
	//return "Good evening";
	//}

	 public static void main(String[] args) {
		 System.out.println("Main method started");
		 System.out.println(welcome());
		 System.out.println(welcome("gd evg"));
		

	}

}
