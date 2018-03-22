package com.github.javapedia.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {

        printState();
        System.out.println();

        for (int j = 0; j < digits.length - 1; j++) {

            for (int i = 0; i < digits.length - 1; i++) {
                if (digits[i] < digits[i + 1]) {
                    digits = swap(digits, i, i + 1);
                }
            }
        }
        printState();
    }

    static int[] digits = {1, 3, 7, 0, 5, 9};

    static int[] swap(int[] digits, int src, int dst) {
        int temp = digits[src];
        digits[src] = digits[dst];
        digits[dst] = temp;
        return digits;
    }

    static void printState() {
        for (int current : digits) {
            System.out.print(current + " ");
        }
    }
}
