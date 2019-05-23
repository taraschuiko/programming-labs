package com.taraschuiko.labs.Lab8;

public class Respondent {
    private int age;
    private boolean gender;
    private int education;
    private boolean answer;
    private Respondent next;

    public Respondent(int age, boolean gender, int education, boolean answer) {
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.answer = answer;
        this.next = null;
    }

    public void setNext(Respondent next) {
        this.next = next;
    }

    public void printData() {
        System.out.println("Age: " + this.age);
        if (this.gender) {
            System.out.println("Gender: Male");
        } else {
            System.out.println("Gender: Female");
        }
        if (education == 1) {
            System.out.println("Education: Primary");
        } else if (education == 2) {
            System.out.println("Education: Secondary");
        } else if (education == 3) {
            System.out.println("Education: Higher");
        }
        if (answer) {
            System.out.println("Answer: Yes");
        } else {
            System.out.println("Answer: No");
        }

    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public int getEducation() {
        return education;
    }

    public boolean getAnswer() {
        return answer;
    }

    public Respondent getNext() {
        return next;
    }
}
