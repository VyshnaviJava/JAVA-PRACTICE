package com.Oops02;

public interface Loan {
	public abstract String getCustomerAddressDetails();
	
	public abstract	boolean isValidPAN();
	
	public abstract boolean isValidPhone();
	 
	public abstract boolean isValidAadhaar();
	 
	public abstract double getROI() ;
	 
	public abstract int getCibiliScore() ;
	 
	public abstract int getCustomerAge() ;
	 
	public abstract double getCustomerSalary();
	 
}
