package com.taraschuiko.labs.Lab8Lyubomyr;

public class BinaryTree {
    Node root;

    public void add(String englishWord, String ukrainianWord, int count) {
        root = addRecursive(root, englishWord, ukrainianWord, count);
    }

    private Node addRecursive(Node current, String englishWord, String ukrainianWord, int count) {
        if (current == null) {
            return new Node(englishWord, ukrainianWord, count);
        }

        int diff = englishWord.charAt(0) - current.englishWord.charAt(0);

        if (diff < 0) {
            current.left = addRecursive(current.left, englishWord, ukrainianWord, count);
        } else {
            current.right = addRecursive(current.right, englishWord, ukrainianWord, count);
        }

        return current;
    }
}
