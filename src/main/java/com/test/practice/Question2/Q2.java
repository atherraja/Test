package com.exam.Test.Question2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("**********Enter Basic Salary Less then 15000.00********** ");
        System.out.println("Enter Basic Salary : ");
        double basicSalary = obj.nextDouble();

        System.out.println("Enter your Home Rental Allowance Percent : ");
        double homeRent = obj.nextDouble();
        double homeRentPercent = 10 * basicSalary / 100;

        System.out.println("Enter your Dining Allowance Percent : ");
        double diningAllowance = obj.nextDouble();
        double diningAllowancePercent = 90 * basicSalary / 100;


        System.out.println("Your Basic Salary is : " + basicSalary);
        System.out.println("Your Home Rental Allowance is : " + homeRentPercent);
        System.out.println("Your Dining Allowance is : " + diningAllowancePercent);

        System.out.println("");

        Scanner obj2 = new Scanner(System.in);
        System.out.println("*****Enter Basic Salary equal or above to 15000.00 but less than 20000.00***** ");
        System.out.println("Enter Basic Salary : ");
        double basicSalary2 = obj2.nextDouble();

        System.out.println("Enter your Home Rental Allowance Percent : ");
        double homeRent2 = obj2.nextDouble();
        double homeRentAmount = 500;

        System.out.println("Enter your Dining Allowance Percent : ");
        double diningAllowance2 = obj2.nextDouble();
        double diningAllowancePercent2 = 98 * basicSalary / 100;

        System.out.println("Your Basic Salary is : " + basicSalary2);
        System.out.println("Your Home Rental Allowance is : " + homeRentAmount);
        System.out.println("Your Dining Allowance is : " + diningAllowancePercent2);
        System.out.println("*************************************************************");






















    }

}
