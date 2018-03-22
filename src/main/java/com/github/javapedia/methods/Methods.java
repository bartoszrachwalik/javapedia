package com.github.javapedia.methods;

public class Methods {

    public static void main(String[] args) {

        addAndPrint(a, b);
        divideAndPrint(a, b);
        System.out.println(sumOfTwoIntegers(a, b));
    }

    static int a = 3;
    static int b = 9;

    // zwrca inta, który jest sumą dwóch parametrów
    static int sumOfTwoIntegers(int a, int b) {
        return a + b;
    }

    //nie zwraca niczego, ale wyświetla sumę dwóch parametrów
    static void addAndPrint(int a, int b) {
        System.out.println(a + b);
    }

    static void divideAndPrint(int a, int b) {
        if (b == 0) {
            System.out.println("dzielenie przez 0");
            return;
        }
        System.out.println(a / b);
    }

    //metoda przeladowana rozni się przyjmowamymi parametrami lub ich kolejnoscia
    void printArray(int[] toPrint) {
        for (int value : toPrint) {
            System.out.println(value);
        }
    }

    void printArray(int[][] toPrint) {
        for (int[] values : toPrint) {
            printArray(values);
        }
    }
}
