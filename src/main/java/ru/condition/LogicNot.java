package ru.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {

        boolean rsl = LogicNot.isEven(5);
        System.out.println(rsl);
        rsl = LogicNot.isPositive(-10);
        System.out.println(rsl);
        rsl = LogicNot.notEven(4);
        System.out.println(rsl);
        rsl = LogicNot.notPositive(-20);
        System.out.println(rsl);
        rsl = LogicNot.notEvenAndPositive(6);
        System.out.println(rsl);
        rsl = LogicNot.evenOrNotPositive(-10);
        System.out.println(rsl);

    }

}

