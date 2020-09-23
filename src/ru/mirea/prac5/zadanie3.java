package ru.mirea.prac5;

public class zadanie3 {
    public static String recursion(int a, int b) {
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(34, 18));
        System.out.println(recursion(8, 19));
    }
}