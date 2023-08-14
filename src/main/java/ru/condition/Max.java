package ru.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int rsl;
        rsl = Max.max(4, 3);
        System.out.println("Максимальное число: " + rsl);
    }

}
