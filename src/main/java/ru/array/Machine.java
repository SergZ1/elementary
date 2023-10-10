package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int delta = money - price;
        int size = 0;
        for (int index : coins) {
            while (delta >= index) {
                rsl[size++] = index;
                delta -= index;

            }

        }
        return Arrays.copyOf(rsl, size);
    }
}
