package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int count = 2; number >= count; count++) {
            if ((number % count) != 0) {
                prime = true;
                break;

            } else if ((number % count) == 0) {
                prime = false;
                break;

            }
        }
        return prime;
    }
}




