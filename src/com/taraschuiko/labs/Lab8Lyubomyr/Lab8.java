package com.taraschuiko.labs.Lab8Lyubomyr;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();
        while (true) {
            System.out.println("A - add item; F - finish adding");
            String key = scanner.nextLine();
            switch (key) {
                case "A": addItem(bt); break;
                case "a": addItem(bt); break;
                case "P": buildNewTree(bt, bt2); return;
                case "p": buildNewTree(bt, bt2); return;
                default: continue;
            }
        }
    }

    static void addItem(BinaryTree bt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("English word: ");
        String englishWord = scanner.nextLine();
        System.out.println("Ukrainian word: ");
        String ukrainianWord = scanner.nextLine();
        System.out.println("Count: ");
        int count = 0;
        try {
            count = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Input a valid count");
            addItem(bt);
        }
        bt.add(englishWord, ukrainianWord, count);
    }

    static void buildNewTree(BinaryTree bt, BinaryTree bt2) {

    }
}
