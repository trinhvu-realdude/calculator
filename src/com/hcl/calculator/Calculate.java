package com.hcl.calculator;

public class Calculate {

    public int plus(int a, int b) {
        return a + b;
    }

    public double plus(double a, double b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {

        return a / b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double percentage(double a) {
        return a / 100;
    }

    public boolean isDecimal(String input) {
        if (input.contains(".")) {
            return true;
        }
        return false;
    }
}
