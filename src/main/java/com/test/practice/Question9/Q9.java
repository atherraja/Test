package com.exam.Test.Question9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int x1 = 19, y1 = -1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the X-AXIS : ");
        int x2 = input.nextInt();

        System.out.println("Enter the Y-AXIS : ");
        int y2 = input.nextInt();

        System.out.println("Enter Radius : ");
        int radius = input.nextInt();

        double distance = Math.sqrt((x2-x1)^2 + (y2-y1)^2 );

        if (distance < radius){
            System.out.println("Inside the circle");
        }
        else if (distance == radius) {
            System.out.println("On the Point");
        }

        else {
            System.out.println("Outside the circle");
        }
    }
}
