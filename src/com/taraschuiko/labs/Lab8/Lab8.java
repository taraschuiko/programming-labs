package com.taraschuiko.labs.Lab8;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RespondentList respondentList = new RespondentList();
        while (true) {
            System.out.println("N - new respondent; R - get results");
            String key = scanner.nextLine();
            switch (key) {
                case "N": newRespondent(respondentList); break;
                case "n": newRespondent(respondentList); break;
                case "R": getResults(respondentList); return;
                case "r": getResults(respondentList); return;
                default: continue;
            }
        }
    }

    public static void newRespondent(RespondentList respondentList) {
        Scanner scanner = new Scanner(System.in);

//        Age
        System.out.println("Age: input age");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
            if (age < 0) throw new Exception();
        } catch (Exception e) {
            System.out.println("Try again. Please input a number in the age!");
            newRespondent(respondentList);
            return;
        }

//        Gender
        System.out.println("Gender: input M (male) or F (female)");
        boolean gender = false;
        String genderInput = scanner.nextLine();

        if (genderInput.equals("M") || genderInput.equals("m")) {
            gender = true;
        } else if (genderInput.equals("F") || genderInput.equals("f")) {
            gender = false;
        } else {
            System.out.println("Try again. Please input M or F in the gender!");
            newRespondent(respondentList);
            return;
        }

//        Education
        System.out.println("Education: input 1 (primary), 2 (secondary), 3 (higher)");
        int education;
        try {
            education = Integer.parseInt(scanner.nextLine());
            if (education < 1 || education > 3) throw new Exception();
        } catch (Exception e) {
            System.out.println("Try again. Please input 1, 2 or 3 in the education!");
            newRespondent(respondentList);
            return;
        }

//        Question
        System.out.println("Does he/she read books?: Y (yes) or N (no)");
        boolean answer = false;
        String answerInput = scanner.nextLine();

        if (answerInput.equals("Y") || answerInput.equals("y")) {
            answer = true;
        } else if (answerInput.equals("N") || answerInput.equals("n")) {
            answer = false;
        } else {
            System.out.println("Try again. Please input Y or N in the question!");
            newRespondent(respondentList);
            return;
        }

        respondentList.addRespondent(age, gender, education, answer);
    }

    public static void getResults(RespondentList respondentList) {
        Respondent current = respondentList.getRoot();
        int result1 = 0;
        while (true) {
            if (current.getGender() && current.getAge() > 40 && current.getEducation() == 3 && current.getAnswer()) {
                result1++;
            }
            current = current.getNext();
            if (current == null) break;
        }

        current = respondentList.getRoot();
        int result2 = 0;
        while (true) {
            if (!current.getGender() && current.getAge() < 30 && current.getEducation() == 2 && !current.getAnswer()) {
                result2++;
            }
            current = current.getNext();
            if (current == null) break;
        }

        current = respondentList.getRoot();
        int result3 = 0;
        while (true) {
            if (current.getGender() && current.getAge() < 25 && current.getEducation() == 1 && current.getAnswer()) {
                result3++;
            }
            current = current.getNext();
            if (current == null) break;
        }

        System.out.println(result1 + " men, older than 40, that have higher education, answered 'yes'");
        System.out.println(result2 + " women, younger than 30, that have secondary education, answered 'no'");
        System.out.println(result3 + " men, younger than 25, that have primary education, answered 'yes'");

        respondentList.printAllRespondents();
    }
}
