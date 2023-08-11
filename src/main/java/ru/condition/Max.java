package ru.condition;

public class Max {

    public static String max(int left, int right) {
        return left > right ? "Left > right" : "Right > Left";
    }

    public static void main(String[] args) {
        String rsl;
        rsl = Max.max(4, 3);
        System.out.println(rsl);
    }

}
