package com.taraschuiko.labs.Lab8Lyubomyr;

public class Node {
    String englishWord;
    String ukrainianWord;
    int count;
    Node left;
    Node right;

    Node(String englishWord, String ukrainianWord, int count) {
        this.englishWord = englishWord;
        this.ukrainianWord = ukrainianWord;
        this.count = count;
        left = null;
        right = null;
    }

    public String getEnglishWord() {
        count++;
        return englishWord;
    }

    public String getUkrainianWord() {
        count++;
        return ukrainianWord;
    }

    public int getCount() {
        count++;
        return count;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
