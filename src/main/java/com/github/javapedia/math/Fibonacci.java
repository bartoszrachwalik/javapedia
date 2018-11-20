package com.github.javapedia.math;

class Fibonacci {
    int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number can not be negative!");
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
