package com.Oops02;

interface In1{
	
}
//Cycle detected :The type testA2 cannot extend/implement itself or
//one of its own member types
//class TestA2 extends TestA2{
class TestA2{
	
}
//Hybrid inheritance
class TestA3 extends TestA2 implements In1{
	
}

public class TestDemo10 {

	public static void main(String[] args) {
		
	}

}
