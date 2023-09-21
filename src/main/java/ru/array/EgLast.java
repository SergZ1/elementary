package ru.array;

public class EgLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int index = 0; index < left.length && index < right.length; index++) {
            if (left[left.length - 1] != right[right.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
