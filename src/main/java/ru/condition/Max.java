package ru.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? 4 : 3;
        return result;
    }

    public static void main(String[] args) {

        int rsl;
        rsl = Max.max(4, 3);
        System.out.println(rsl);
    }

    }
