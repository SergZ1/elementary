package ru.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int l = 1; l <= n; l++) {
        result = result * l;
        }
        return result;
    }
}

