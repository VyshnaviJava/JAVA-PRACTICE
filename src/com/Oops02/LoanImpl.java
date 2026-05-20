package com.Oops02;

import java.util.Scanner;

//parent or super or base class
public class LoanImpl implements Loan {

	
		static Scanner sc = new Scanner(System.in);
		
		Object hello(){
			return new Object();
		}
		
		public Number getPhone(){
			Long l = 9972655567L;
			return l ;
		}
		
		@Override
		public String getCustomerAddressDetails() {

	        String address = null;

	        System.out.println("Enter your Flat number : ");
	        String fno = sc.next();

	        System.out.println("Enter your plot number : ");
	        sc.nextLine();
	        String plot = sc.nextLine();

	        System.out.println("ENter Your Street name ");
	        String street = sc.nextLine();

	        System.out.println("ENter Your City name ");
	        String city = sc.nextLine();

	        System.out.println("ENter Your PINCODE ");
	        long pin = sc.nextLong();

	        address = "Flat NO : " + fno
	                + " , Plot :" + plot
	                + " , Street : " + street
	                + " , City : " + city
	                + " , PIN : " + pin;

	        return address;
	    }
		@Override
	    public boolean isValidPAN() {
	    	System.out.println("Enter PAN  number");
	    	String pan = sc.next();
	        return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	    }
		@Override
	    public boolean isValidPhone() {
	    	System.out.println("Enter phone number:");
	    	String phone= sc.next();
	        return phone.matches("[6-9]\\d{9}");
	    }
		@Override

	    public boolean isValidAadhaar() {
	    	System.out.println("Enter 12 digit aadhar number");
	    	String Aadhaar = sc.next();
	        return Aadhaar.matches("\\d{12}");
	    }
		@Override
	    public double getROI() {
	        return 10.5;
	    }
		@Override
	    public int getCibiliScore() {

	        System.out.println("Enter your Cibil Score ");
	        int cibil = sc.nextInt();

	        return cibil;
	    }
		@Override
	    public int getCustomerAge() {

	        System.out.println("Customer Age :");
	        int age = sc.nextInt();

	        return age;
	    }
		@Override
		  public double getCustomerSalary() {
			System.out.println("Enter your Salary : ");
	        double salary = sc.nextDouble();

	        return salary;
	    }
}


