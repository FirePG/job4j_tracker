package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int d) {
        return Calculator.sum(d) + Calculator.minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        int result1 = sum(5);
        System.out.println(result1);
        int result2 = calculator.multiply(4);
        System.out.println(result2);
        int result3 = minus(10);
        System.out.println(result3);
        int result4 = calculator1.divide(5);
        System.out.println(result4);
        int result5 = calculator2.sumAllOperation(5);
        System.out.println(result5);
    }
}