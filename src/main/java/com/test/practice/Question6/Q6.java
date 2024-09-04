package com.exam.Test.Question6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = input.nextInt();
        System.out.println("Enter selling price : ");
        int sp = input.nextInt();

        if (cp < sp){
            System.out.println("Seller is in profit");
        }
        else {
            System.out.println("Seller is in loss");
        }
    }
}
