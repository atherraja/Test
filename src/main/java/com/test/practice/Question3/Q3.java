package com.exam.Test.Question3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Un married man developer age : ");

        int age1 = obj.nextInt();
        if (age1 > 28 ) {
            System.out.println("Insure male developer : " + age1);
            System.out.println("-----------------------------------------------");

        }
        else {
            System.out.println("Do not Insure male developer : " + age1);
        }

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Un married female developer : ");

        int age2 = obj1.nextInt();
        if (age2 > 22) {
            System.out.println("Insure female developer : " + age2);
        }
        else {
            System.out.println("Do not Insure female developer " + age2);
        }
    }
}
