package com.exam.Test.Question4;

import org.springframework.core.env.Environment;

import java.util.Scanner;

public class Q4A {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your pin code : ");
        int pin = reader.nextInt();

        if (pin == 1234)
        {
            System.out.println("Accepted");
            System.exit(0);
        }
        else if (pin != 1234)
        {
            System.out.println("Not Accepted, Enter Correct pin code");
        }









    }
}




























