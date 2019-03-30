package com.taraschuiko.labs.Lab3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        int [][] matrix = inputMatrix();

        System.out.println("Матриця:");
        printMatrix(matrix);

        int firstZeroColumn = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0 && firstZeroColumn == -1) firstZeroColumn = j;
            }
        }

        System.out.print("Номер першого стовбця, який містить хоч один від’ємний елемент: ");
        System.out.println(firstZeroColumn != -1 ? firstZeroColumn : "не знайдено");

        Arrays.sort(matrix, Comparator.comparing((int [] arr) -> {
            int negativeEvenElements = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0 && arr[i] %2 == 0) {
                    negativeEvenElements++;
                }
            }
            return 0 - negativeEvenElements;
        }));

        System.out.println("Відсортована матриця:");
        printMatrix(matrix);
    }

    private static int [][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Рядків = ");
        int rows = scanner.nextInt();
        System.out.print("Стовпців = ");
        int columns = scanner.nextInt();

        int [][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            System.out.println("Рядок " + i);
            for (int j = 0; j < columns; j++) {
                System.out.print(j + " = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
