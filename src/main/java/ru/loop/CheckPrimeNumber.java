package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int count = 2; number >= count; count++) {
            if ((number % count) != 0) {
                prime = true;
                break;
            }
        prime = number % count != 0;
            break;
        }
        return prime;
    }
}




