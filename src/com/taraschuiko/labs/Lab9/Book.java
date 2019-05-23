package com.taraschuiko.labs.Lab9;

import java.util.ArrayList;

public class Book {
    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        for (Item currentItem : this.items) {
            if (currentItem == item) {
                this.items.remove(item);
            }
        }
    }

    public Item findByName(String name) {
        for (Item item : this.items) {
            if (item.getName().equals(name)) return item;
        }
        return null;
    }

    public Item findByBirthYear(int birthYear) {
        for (Item item : this.items) {
            if (item.getBirthYear() == birthYear) return item;
        }
        return null;
    }

    public Item findByPhoneNumber(int phoneNumber) {
        for (Item item : this.items) {
            if (item.getPhoneNumber() == phoneNumber) return item;
        }
        return null;
    }

    public void sortByName() {
        for (int i = 1; i < this.items.size(); i++) {
            Item temp = this.items.get(i);
            String tempName = temp.getName();
            for (int j = i; j > 0; j--) {
                if (this.items.get(j-1).getName().charAt(0) > tempName.charAt(0)) {
                    this.items.set(j, this.items.get(j-1));
                    this.items.set(j-1, temp);
                } else {
                    break;
                }
            }
        }
    }

    public void sortByBirthYear() {
        for (int i = 1; i < this.items.size(); i++) {
            Item temp = this.items.get(i);
            int tempBirthYear = temp.getBirthYear();
            for (int j = i; j > 0; j--) {
                if (this.items.get(j-1).getBirthYear() > tempBirthYear) {
                    this.items.set(j, this.items.get(j-1));
                    this.items.set(j-1, temp);
                } else {
                    break;
                }
            }
        }
    }
}
