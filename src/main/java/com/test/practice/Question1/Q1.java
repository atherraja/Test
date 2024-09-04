package com.exam.Test.Question1;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       // System.out.println("Enter your Amount : ");
        //int amount = obj.nextInt();

        System.out.println("Enter your Entire Bill Amount : ");
        int entireBillAmount  = obj.nextInt();

        int percent = 10*entireBillAmount/100;

        if (entireBillAmount > 5000){
            System.out.println("The discount is for this amount : " + percent);
        }
        else{
            System.out.println("This discount is not valid for this amount : " + percent );
        }


    }
}
