package com.witchallenge.Calculator;

import java.math.BigDecimal;

/**
 * Classe usada para o cálculo das operações básicas
 * @author João Xavier
 */

public class Calculator {

    //função soma
    public static BigDecimal sum(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    //função subtração
    public static BigDecimal subtract(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    //função multiplicação
    public static BigDecimal multiply(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    //função divisão
    public static BigDecimal divide(BigDecimal a, BigDecimal b) throws ArithmeticException{
        return a.divide(b);
    }
}
