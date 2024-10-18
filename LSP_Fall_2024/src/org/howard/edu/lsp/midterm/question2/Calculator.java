package org.howard.edu.lsp.midterm.question2;


public class Calculator {
    // Sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum of two doubles
    public static double sum(double a, double b) {
        return a + b;
    }

    // Sum of an array of integers
    public static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}
