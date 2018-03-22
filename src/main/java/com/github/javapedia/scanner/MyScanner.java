package com.github.javapedia.scanner;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nameAndSurname = "null";
        int birthYear = 0;
        double accountState = 0;
        boolean nameAndSurnameIsCorrect = false;
        boolean birthYearIsCorrect = false;
        boolean accountStateIsCorrect = false;

        /*double number = input.nextDouble();
        System.out.println("Square root of yor number: "+Math.sqrt(number));*/

        do {
            if (!nameAndSurnameIsCorrect) {
                System.out.println("Give your name: ");
                if (input.hasNextLine()) {
                    nameAndSurname = input.nextLine();
                    nameAndSurnameIsCorrect = true;
                }
            }
            if (!birthYearIsCorrect) {
                System.out.println("Give your birth year: ");
                if (input.hasNextInt()) {
                    birthYear = input.nextInt();
                    birthYearIsCorrect = true;
                }
            }
            if (!accountStateIsCorrect) {
                System.out.println("Give your account state: ");
                if (input.hasNextDouble()) {
                    accountState = input.nextDouble();
                    accountStateIsCorrect = true;
                }
            }

        } while (!accountStateIsCorrect || !birthYearIsCorrect || !nameAndSurnameIsCorrect);
        System.out.println("Name and surname: " + nameAndSurname + "\nBirth year: " + birthYear + "\nAccount state: " + accountState);

    }
}
