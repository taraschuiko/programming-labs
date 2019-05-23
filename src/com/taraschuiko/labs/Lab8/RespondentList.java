package com.taraschuiko.labs.Lab8;

public class RespondentList {
    private Respondent root;
    private Respondent last;

    public RespondentList() {
        this.root = null;
        this.root = null;
    }

    public void addRespondent(int age, boolean gender, int education, boolean answer) {
        Respondent newRespondent = new Respondent(age, gender, education, answer);

        if (root == null) {
            root = newRespondent;
            last = newRespondent;
        } else {
            last.setNext(newRespondent);
            last = newRespondent;
        }
    }

    public Respondent getRoot() {
        return root;
    }

    public void printAllRespondents() {
        Respondent current = this.root;
        while (true) {
            System.out.println();
            current.printData();
            current = current.getNext();
            if (current == null) break;
        }
    }
}
