package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && first < third) {
            result = third;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }
}
