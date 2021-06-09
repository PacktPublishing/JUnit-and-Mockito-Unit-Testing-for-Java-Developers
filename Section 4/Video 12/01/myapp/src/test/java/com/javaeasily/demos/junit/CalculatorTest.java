package com.javaeasily.demos.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        // arrange
        Calculator calc = new Calculator();
        int a = 10;
        int b = 20;

        // act
        int result = calc.add(a, b);

        // assert
        assertEquals(30, result);
    }

    @Test
    public void testAddZeroToPositive() {
        // arrange
        Calculator calc = new Calculator();
        int a = 10;
        int b = 0;

        // act
        int result = calc.add(a, b);

        // assert
        assertEquals(10, result);
    }

}