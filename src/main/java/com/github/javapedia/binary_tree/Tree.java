package com.github.javapedia.binary_tree;

class Tree {
    private Node root;

    public Tree() {
    }

    void add(Integer value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(root, value);
        }
    }

    void print() {
        if (root != null) {
            root.print();
        }
    }
}
