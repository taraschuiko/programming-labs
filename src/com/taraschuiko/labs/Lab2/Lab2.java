package com.taraschuiko.labs.Lab2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть n: ");
        int n = scanner.nextInt();
        System.out.print("Введіть C: ");
        int c = scanner.nextInt();

        Integer array[] = new Integer[n];
        int countGreaterThanC = 0;
        int maxAbsElementIndex = 0;

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            array[i] = scanner.nextInt();
            if (array[i] > c) {
                countGreaterThanC++;
            }
            if (Math.abs(array[i]) > Math.abs(array[maxAbsElementIndex])) {
                maxAbsElementIndex = i;
            }
        }

        int timesAfterMax = 1;

        for (int i = maxAbsElementIndex + 1; i < n; i++) {
            timesAfterMax *= array[i];
        }

        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        System.out.println("Кількість елементів більших за C дорівнює " + countGreaterThanC);
        System.out.println("Добуток елементів масива, розміщених після максимального по модулю елемента дорівнює " +
                timesAfterMax);

        System.out.println("Відсортований масив");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
