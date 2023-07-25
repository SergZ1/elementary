package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double calc = x1 - x2;
        double calc1 = y1 - y2;
        double first = Math.pow(calc, 2);
        double first1 = Math.pow(calc1, 2);
        first = first + first1;
        double fin = Math.sqrt(first);
        return fin;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
