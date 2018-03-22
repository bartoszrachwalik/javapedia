package com.github.javapedia.collections;

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Emil");
        hashSet.add("Jozek");
        hashSet.add("Patryk");
        hashSet.add("Zosia");
        hashSet.add("Wojtek");
        hashSet.add("Cyryl");
        hashSet.add("Kamil");
        hashSet.add("Patrycja");
        hashSet.add("Wlodek");
        hashSet.add("Kazik");

        for (String s : hashSet) {
            System.out.print(s + " ");
        }
        System.out.println();
        int i = 0;
        for (String s : hashSet) {
            i++;
            if (i % 3 == 0) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
        for (String s : hashSet) {
            if (s.length() > 6)
                System.out.print(s + " ");
        }
        System.out.println();
        for (String s : hashSet) {
            if (s.startsWith("P"))
                System.out.print("true ");
        }
    }
}
