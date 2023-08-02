package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
               + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {

        return minus(first, second)
                + divide(first, second);
    }

    public static double sumAll() {

        return sumAndMultiply(10, 20) + minusAndDivide(10, 20);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumAll());

    }
}
