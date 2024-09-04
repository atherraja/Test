package com.exam.Test.Question7;

import java.util.Scanner;

public class Q7B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Age of Alpha : ");
        int age1 = input.nextInt();

        System.out.println("Enter the Age of Bravo : ");
        int age2 = input.nextInt();

        System.out.println("Enter the Age of Charlie : ");
        int age3 = input.nextInt();

        if (age1 < age2 && age1 < age3){
            System.out.println("The youngest age of Alpha : ");
        }
        else if (age2 < age1 && age2 < age3) {
            System.out.println("The youngest age of Bravo : ");
        }
        else
        {
            System.out.println("The youngest Charlie : ");
        }

    }
}
