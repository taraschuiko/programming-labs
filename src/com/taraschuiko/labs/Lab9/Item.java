package com.taraschuiko.labs.Lab9;

public class Item {
    String name;
    int birthYear;
    int phoneNumber;

    public Item(String name, int birthYear, int phoneNumber) {
        this.name = name;
        this.birthYear = birthYear;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
