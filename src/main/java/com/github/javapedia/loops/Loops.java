package com.github.javapedia.loops;

public class Loops {

    public static void main(String[] args) {

        double[] numbers = new double[100];

        //petla for
        for (int i = 0; i < 100; i++) {
            numbers[i] = i * 2;
        }

        int i = 0;
        //przerobiona na for each
        for (double current : numbers) {
            current = i * 2;
            i++;
        }

        //petla while
        while (i < 10) {
            i++;
        }

        int y = 0;

        //petla do while
        do {
            y++;
        } while (y < 10);

        int[] someDigits = {5, 6, 3, 1, 6, 7};

        //petla for each
        for (int current : someDigits) {
            System.out.println((current));
        }

        //co odpowiada forowi
        for (int j = 0; j < someDigits.length; j++) {
            int current = someDigits[j];
            System.out.println(current);
        }
    }
}
