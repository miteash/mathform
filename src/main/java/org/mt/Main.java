package org.mt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Math Try!");
        int a = 5;
        int b = 5;
        int sum = add(a, b);
        System.out.println("Sum = " + sum);
        int mult = mult(a, b);
        System.out.println("Mult = " + mult);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }
}