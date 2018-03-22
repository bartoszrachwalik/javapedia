package com.github.javapedia.strings;

public class ChristmasTree {

    public static void main(String[] args) {

        String choinka = "    *";
        StringBuffer stringBuff = new StringBuffer(choinka);

        int k = 3;

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < k; i++) {
                System.out.println(choinka);
                stringBuff.delete(0, 1);
                stringBuff.append("**");
                choinka = stringBuff.toString();
            }
            k++;

            stringBuff.delete(0, k + 3);
            stringBuff.insert(0, "    ");
            choinka = stringBuff.toString();
        }
    }
}
