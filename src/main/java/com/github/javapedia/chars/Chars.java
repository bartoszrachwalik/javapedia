package com.github.javapedia.chars;

public class Chars {

    public static void main(String[] args) {

        //podstawowe rozwiązanie
        char[] letters = {'a', 'A', '[', 'g', 'Z', '@'};

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 'a' && letters[i] <= 'z')
                System.out.println(letters[i] + " - jest mala litera");

            else if (letters[i] >= 'A' && letters[i] <= 'Z')
                System.out.println(letters[i] + " - jest duza litera");

            else System.out.println(letters[i] + " - nie jest litera");
        }

        //poprzednia petla przerobiona na for each
        /*for (char current : letters) {
            if (current == 'a' && current <= 'z')
                System.out.println((current) + " - jest mala litera");

            else if (current >= 'A' && current <= 'Z')
                System.out.println((current) + " - jest duza litera");

            else System.out.println((current) + " - nie jest litera");
        }*/

        //wywołanie metody statycznej
        //upperOrLowerCase(letters);
    }

    //wydzielenie do metody
    private static void upperOrLowerCase(char[] letters) {
        for (char current : letters) {
            if (isInRange(current, 'a', 'z'))
                System.out.println((current) + " - jest mala litera");

            else if (isInRange(current, 'A', 'Z'))
                System.out.println((current) + " - jest duza litera");

            else System.out.println((current) + " - nie jest litera");
        }
    }

    private static boolean isInRange(char letter, char left, char right) {
        return letter >= left && letter <= right;
    }
}
