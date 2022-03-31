package com.witchallenge.Calculator;

import java.math.BigDecimal;

public class CalculatorMain {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(-12.52);
        BigDecimal b = BigDecimal.valueOf(-10);
        System.out.println("Soma: " + Calculator.sum(a, b));
        System.out.println("Subtração: " + Calculator.subtract(a, b));
        System.out.println("Multiplicação: " + Calculator.multiply(a, b));
        System.out.println("Divisão: " + Calculator.divide(a, b));
    }
}
