package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int tempNum;
        boolean prime = number > 1;
            for (int i = 2; i < number; i++) {
                tempNum = i;
                if (number % tempNum == 0) {
                    prime = false;
                    break;
                }
            }
        return prime;
    }
}