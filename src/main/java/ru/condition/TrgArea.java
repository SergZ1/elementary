package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = Math.sqrt(3 * (3 - 2) * (3 - 2) * (3 - 2));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
