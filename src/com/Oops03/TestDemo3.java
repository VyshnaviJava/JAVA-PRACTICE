package com.Oops03;

import java.util.Scanner;

//WAP to find areas of
// Triangle,square,circle,rectangle
//triangle :0.5 * base *height
//square : side * side
//circle : PI *r*r
//rectangle : length * breadth
public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Base");
		float base = sc.nextFloat();
		
		System.out.println("Enter a Height");
		double height = sc.nextDouble();
		
		TestDemo3 t = new TestDemo3();
		System.out.println("Area of Triangle : " + t.findArea(base, height));
		
		System.out.println("Enter side :");
		double side = sc.nextDouble();
		System.out.println("Area of square : " + t.findArea(side));
		
		System.out.println("Enter radius");
		float radius = sc.nextFloat();
		System.out.println("Area of circle : " + t.findArea(radius));
		
		System.out.println("Enter a length :");
		double length = sc.nextDouble();
		
		System.out.println("Enter a breadth");
		double breadth = sc.nextDouble();
		System.out.println("Area of rectangle : " + t.findArea(length,breadth));
	}
	double findArea(double l , double b) {
		return l * b;
	}
	double findArea(float r) {
		return Math.PI*r*r;
	}

	double findArea( double side) {
		return side * side;
	}

	
	double findArea(float b , double h) {
		return 0.5 * b  * h;
	}

}

