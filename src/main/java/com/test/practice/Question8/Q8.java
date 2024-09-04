package com.exam.Test.Question8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base value : ");
        int base = input.nextInt();
        System.out.println("Enter the exponent value : ");
        int exp = input.nextInt();
        System.out.println(base + " raise to the power " + exp + " is :");
        double result = Math.pow(base, exp);
        System.out.println(result);
    }

    }

