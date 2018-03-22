package com.github.javapedia.conditions;

public class Switch {

    public static void main(String[] args) {

        int myChoice = 1;

        switch (myChoice) {
            case 1:
                System.out.println("wybrałem 1");
                break;
            case 2:
                System.out.println("wybrałem 2");
                break;
            default:
                System.out.println("wybrałem coś innego");
        }
    }
}
