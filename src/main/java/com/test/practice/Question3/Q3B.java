package com.exam.Test.Question3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3B {
    public static void main(String[] args) {

        String arrayOne = "originalArray : ";
        String arrayTwo = "SecondArray : ";

        System.out.println("Enter your 2D Array Values : ");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Rows");
        int row = scanner.nextInt();
        System.out.println("Enter the Column");
        int column = scanner.nextInt();
        System.out.println("Your 2D array is : ");

        String[][] array = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.next();
            }
        }
        System.out.println("The array is:" + arrayOne);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Flipped Array is : " + arrayTwo);
        for (int i = 0; i < row; i++) {
            for (int j = column - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}




















