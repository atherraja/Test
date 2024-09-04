package com.exam.Test.Question7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number : ");

        int num = input.nextInt();

        for(int i = 0; i < 25; i++){
            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));

        }

    }

    }

