package com.exam.Test.Question4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number : " );

        int num = reader.nextInt();

        if(num % 2 == 0 ){
            System.out.println(num + " is even ");
        }
        else {
            System.out.println(num + " is odd ");
        }

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter a negative number : " );

        int negativeNum = reader1.nextInt();


        if(negativeNum % -2 ==0 ){
            System.out.println(negativeNum + " Negative even ");
        }
        else {
            System.out.println(negativeNum + " Negative odd");
        }

    }
}
