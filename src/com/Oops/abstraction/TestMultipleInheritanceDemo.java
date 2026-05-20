package com.Oops.abstraction;

interface In1{
	void method1();
	
	void method2();
}
interface In2{
	void method2();
	
	void method3();
	
}
//interface can extend a interface yes
//In java multiple inheritance is posiible with interfaces bcoz we have unique
//implementation
// -method1 is referring In1 interface
// -method3 is referring In3 Interface
//-method2 is referring based on order of extends



interface In3 extends In1,In2{
	
}
class TestIn implements In3{

	@Override
	public void method1() {
		System.out.println("Method1 called");
		
	}

	@Override
	public void method2() {
		System.out.println("method2 called");
		
	}

	@Override
	public void method3() {
		System.out.println("Method3 called");
		
	}
	
}

public class TestMultipleInheritanceDemo {

	public static void main(String[] args) {
		
		In3 i = new TestIn();
		i.method1();
		i.method2();
		i.method3();
		

	}

}
