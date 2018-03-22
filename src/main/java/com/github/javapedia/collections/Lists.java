package com.github.javapedia.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> userNames = new ArrayList<String>();

        userNames.add("Pakosia");
        userNames.add("Ania");
        userNames.add("Basia");
        userNames.add("Gosia");
        userNames.add("Kazik");
        userNames.add("Ben");
        userNames.add("Ahmed");
        userNames.add("Pola");
        userNames.add("Jurek");
        userNames.add("Bezimienny");

        for (String userName : userNames) {
            System.out.print(userName+" ");
        }
        System.out.println();
        for (int i = 0; i < userNames.size(); i = i + 2) {
            System.out.print(userNames.get(i)+" ");
        }
        System.out.println();
        for (String userName : userNames) {
            if (userName.length() > 6)
                System.out.print(userName+" ");
        }
        System.out.println();
        for (String userName : userNames) {
            if(userName.startsWith("P"))
                System.out.print("true ");
        }
    }
}
