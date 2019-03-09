package com.taraschuiko.labs;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        System.out.print("X start: ");
        double xStart = scanner.nextDouble();

        System.out.print("X end: ");
        double xEnd = scanner.nextDouble();

        System.out.print("dX: ");
        double dx = scanner.nextDouble();

        for (double x = xStart; x <= xEnd; x += dx) {
            if (!((int) a != 0 || (int) b != 0 || (int) c != 0)) {
                f(a, b, c, x);
            } else {
                f(a, b, c, x);
            }
        }
    }

    private static double f(double a, double b, double c, double x) {
        double y;
        if (x < 0 && b != 0) {
            y = -a * Math.pow(x, 2) + b;
        } else if (x > 0 && b == 0) {
            y = x / (x - c) + 5.5;
        } else {
            y = x / -c;
        }
        System.out.println("a = " + a + "; b = " + b + "; c = " + c + "; x = " + x + "; F = " + y);
        return y;
    }
}
