package ru.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(max(left, right), max(third, fourth));
    }

    public static void main(String[] args) {
        int rsl;
        rsl = Max.max(4, 3);
        System.out.println("Максимальное число: " + rsl);
        rsl = Max.max(4, 3, 5);
        System.out.println("Максимальное число: " + rsl);
        rsl = Max.max(4, 3, 6, 9);
        System.out.println("Максимальное число: " + rsl);
    }
}
