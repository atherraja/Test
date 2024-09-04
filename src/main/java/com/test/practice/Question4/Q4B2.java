package com.exam.Test.Question4;

import java.util.Scanner;

public class Q4B2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix Multiplication");
        System.out.println("Enter first Matrix elements");

        int rows1 = scanner.nextInt();
        int column1 = scanner.nextInt();
        System.out.println("Enter Second Matrix elements");
        int rows2 = scanner.nextInt();
        int column2 = scanner.nextInt();
        if (column1!=rows2)
        {
            System.out.println("Matrix multiplication is not possible");
        }

        int[][] matrix1 = new int[rows1][column1];
        int [][] matrix2 = new int[rows2][column2];
        int[][] result = new int[column1][rows2];
        System.out.println("Enter the element First of matrix");
        for (int i=0; i< rows1; i++)
        {
            for (int j=0; j< column1; j++)
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the element of Second matrix");
        for (int i=0; i< rows2; i++)
        {
            for (int j=0; j< column2; j++)
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Resultant Matrix :");
        for (int i=0; i<rows1; i++)
        {
            for (int j= 0; j<column2; j++)
            {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        for (int[] val: result) {
            for (int finalResult:val) {
                System.out.print(" "+finalResult);
            }
            System.out.println();
        }

    }
}










































