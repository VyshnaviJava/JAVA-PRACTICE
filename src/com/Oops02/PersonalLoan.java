package com.Oops02;

import java.util.Scanner;
//child or sub or derived class
public class PersonalLoan extends LoanImpl {

    static Scanner sc = new Scanner(System.in);

   
    void getPersonalLoanDocInfo() {
    	System.out.println("submitted all the documents succesffully");
    }
    @Override
    String hello() {
    	return "hello";
    }
    @Override
   public Number getPhone(){
		Long l = 9972655567L;
		return l ;
	}
    @Override
    public double getROI() {
        return 8.5;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Vcube personal Loan Banking !!");
//Scenario 1:
        PersonalLoan pl = new PersonalLoan();
 //scenario 2:
        LoanImpl l1 = new LoanImpl();
 //scenario 3:
        LoanImpl l2 = new PersonalLoan();
        System.out.println("**********"+l2.getROI());
 //scenario 4 :
        PersonalLoan p2 = (PersonalLoan)new LoanImpl();
        p2.getROI();

        int cibil = pl.getCibiliScore();
        double salary = pl.getCustomerSalary();
        int age = pl.getCustomerAge();

        if (cibil > 760 && salary > 1000000.00 && age > 25 && pl.isValidAadhaar()&&pl.isValidPAN()&&pl.isValidPhone()) {

            System.out.println("Congratulations !! Your personal Loan got approved ");
            System.out.println("your personal loan roi is : "+pl.getROI());
            System.out.println("as entered confirming ur details");
            System.out.println(pl.getCustomerAddressDetails());
            pl.getPersonalLoanDocInfo();

        } else {

            System.out.println("Sorry !! Your personalLoan got Rejected ");
        }
    }
}