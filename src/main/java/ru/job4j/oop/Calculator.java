package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int value) {
        return x + value;
    }

    public static int minus(int value) {
        return value - x;
    }

    public int multiply(int value) {
        return x * value;
    }

    public int divide(int value) {
        return value / x;
    }

    public double sumAllOperation(int value) {
        return sum(value) + minus(value) + multiply(value) + divide(value);
    }

    public static void main(String[] args) {
        int result1 = sum(10);
        int result2 = minus(20);
        Calculator calculator = new Calculator();
        calculator.multiply(5);
        calculator.divide(5);
        calculator.sumAllOperation(5);
    }
}