package com.Oops02;

public class HomeLoan extends LoanImpl {
	
	void getHomeLoanDocInfo() {
    	System.out.println("submitted all the documents succesffully");
    }

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Home Loan Banking !!");

        HomeLoan hl = new HomeLoan();

        int cibil = hl.getCibiliScore();
        double salary = hl.getCustomerSalary();
        int age = hl.getCustomerAge();

        if (cibil > 700 && salary > 600000.00 && age > 22 && hl.isValidAadhaar()&&hl.isValidPAN()&&hl.isValidPhone()) {

            System.out.println("Congratulations !! Your HomeLoan got approved ");
            System.out.println("your Homeloan roi is : "+hl.getROI());
            System.out.println("as entered confirming ur details");
            System.out.println(hl.getCustomerAddressDetails());
            hl.getHomeLoanDocInfo();

        } else {

            System.out.println("Sorry !! Your HomeLoan got Rejected ");
        }
    }

	}


