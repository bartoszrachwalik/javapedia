package com.github.javapedia.binary_tree;

class Node {
    private Integer value;
    private Node right;
    private Node left;

    public Node(Integer value) {
        this.value = value;
    }

    void insert(Node root, Integer newValue) {
        if (newValue >= root.value) {
            if (root.right != null) {
                insert(root.right, newValue);
            } else {
                root.right = new Node(newValue);
            }
        } else {
            if (root.left != null) {
                insert(root.left, newValue);
            } else {
                root.left = new Node(newValue);
            }
        }
    }

    void print() {
        if (left != null) {
            left.print();
        }
        System.out.println(value);
        if (right != null) {
            right.print();
        }
    }
}
