package com.github.javapedia.math;

class Factorial {
    Integer factorial(Integer n) {
        if (n < 0)
            throw new IllegalArgumentException();
        if (n == 1 || n == 0)
            return n;
        else
            return n * factorial(n - 1);
    }
}