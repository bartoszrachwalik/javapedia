package com.github.javapedia.conditions;

public class Conditions {

    public static void main(String[] args) {

        boolean work = false;
        boolean classes = false;

        //działa jeśli prawda
        if (work) {
            System.out.println("i was at work");
        } else {
            System.out.println("i was not at work");
        }

        //negacja
        if (!work) {
            System.out.println("i was not at work");
        }

        if (classes) {
            System.out.println("i was at classes");
        }

        //logiczny AND
        if (work && classes) {
            System.out.println("i was at work and classes");
        }

        //logiczny OR
        if (work || classes) {
            System.out.println("i was at work or classes");
        }

        int c = 0;

        //podstawia wartość dla c
        if (1 > 2) c = 1;
        else c = 2;

        //inny zapis
        c = 1 > 2 ? 1 : 2;
    }
}
