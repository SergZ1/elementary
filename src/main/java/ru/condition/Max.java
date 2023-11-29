package ru.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        int result;
        result = left > right ? left : right;
        result = result > third ? result : third;
        return result;
    }

    public static int max(int left, int right, int third, int fourth) {
        int result;
        result = left > right ? left : right;
        result = result > third ? result : third;
        result = result > fourth ? result : fourth;
        return result;
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
