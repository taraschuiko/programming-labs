package com.taraschuiko.labs.Lab7Lyubomyr;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Class class1 = new Class1();
        class1.templateMethod();

        Class class2 = new Class2();
        class2.templateMethod();
    }
}

abstract class Class {
    int n, i, count = 0, min, minIndex = 0, sum = 0, buffer, arr[];
    int m, shift, matrix[][];

    abstract void inputData();

    abstract void operations();

    abstract void outputResult();

    void templateMethod() {
        inputData();
        operations();
        outputResult();
    }
}

class Class1 extends Class {
    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        n = Integer.parseInt(scanner.nextLine());

        arr = new int[n];

        System.out.println("Enter elements of array: ");
        for( i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    void operations() {
        min = arr[0];
        for(i = 0; i < n; i++) {
            if(arr[i] == 0) {
                count++;
            }

            if(arr[i] < min) {
                minIndex = i;
            }
        }

        //sum of elemments after min element

        for(i = minIndex + 1; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Array: ");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.println();




        for(i = 1; i < n ; i++) {
            for(int j = 0; j < n - i; j++ ) {

                if(Math.abs(arr[j]) > Math.abs(arr[j + 1]))
                {
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }

            }

        }
    }

    void outputResult() {
        System.out.println("Sorted array: ");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.println();

        System.out.println("Number of 0 elements: " + count);
        System.out.println("Sum of elements after minimum element: " + sum);
    }
}

class Class2 extends Class {
    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        n = Integer.parseInt(scanner.nextLine());
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter k: ");
        shift = Integer.parseInt(scanner.nextLine());

        matrix = new int[n][m];

        System.out.println("Enter elements of matrix");
        for(int l = 0; l < n; l++) {
            for(int r = 0; r < m; r++) {
                matrix[l][r] = Integer.parseInt(scanner.nextLine());
            }

        }

        System.out.println("Entered matrix: ");
        for(int l = 0; l < n; l++) {
            for(int r = 0; r < m; r++) {
                System.out.print(matrix[l][r] + " ");
            }
            System.out.println();
        }
    }

    void operations() {
        int temp;
        for (int i = 0; i < shift; i++) {
            for (int j = 0; j < n; j++) {
                temp = matrix[j][0];
                for (int g = 0; g < m - 1; g++)
                    matrix[j][g] = matrix[j][g + 1];
                matrix[j][m - 1] = temp;
            }
        }
    }

    void outputResult() {
        System.out.println("Changed matrix");
        for(int l = 0; l < n; l++) {
            for(int r = 0; r < m; r++) {
                System.out.print(matrix[l][r] + " ");
            }
            System.out.println();
        }
    }
}