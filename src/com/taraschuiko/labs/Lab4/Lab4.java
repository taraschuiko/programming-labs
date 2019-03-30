package com.taraschuiko.labs.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./lab4.txt");
        Scanner fileScanner = new Scanner(file);
        String text = "";
        while (fileScanner.hasNextLine()) {
            text += fileScanner.nextLine() + " ";
        }
        String [] words = text.split(" ");

        int longestWordIndex = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > words[longestWordIndex].length()) {
                longestWordIndex = i;
            }
        }

        int longestWordTimes = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(words[longestWordIndex])) {
                longestWordTimes++;
            }
        }

        System.out.println("Найдовше слово: " + words[longestWordIndex]);
        System.out.println("Воно зустрічається " + longestWordTimes + " разів");
    }
}

