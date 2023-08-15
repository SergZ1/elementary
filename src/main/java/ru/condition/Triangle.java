package ru.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;

    }

    public static void main(String[] args) {
        boolean rsl = Triangle.exist(6.5, 5.6, 10.5);
        System.out.println(rsl);
    }
}