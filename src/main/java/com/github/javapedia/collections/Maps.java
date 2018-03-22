package com.github.javapedia.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> peselAndName = new HashMap<Integer, String>();

        peselAndName.put(880967, "Unikatowa Kasia");
        peselAndName.put(345667, "Asia");
        peselAndName.put(123467, "Stasia");
        peselAndName.put(678867, "Basia");
        peselAndName.put(789067, "Kasia");
        peselAndName.put(345667, "Katarzyna");
        peselAndName.put(425767, "Ela");
        peselAndName.put(865467, "Ola");
        peselAndName.put(789067, "Kunegunda");
        peselAndName.put(765467, "Helga");

        System.out.println(peselAndName.get(880967));
        peselAndName.replace(880967, "Andrzej");

        for (Map.Entry<Integer, String> entry : peselAndName.entrySet()) {
            System.out.print("PESEL: " + entry.getKey() + " Imię: " + entry.getValue() + " ");
        }

        Map<Integer, Integer> idAndPesel = new HashMap<Integer, Integer>();

        idAndPesel.put(9473, 880967);

        System.out.println();
        System.out.println(peselAndName.get(idAndPesel.get(9473)));
    }
}
