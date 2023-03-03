package com.javaeasily.demos.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers() {
        // arrange
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
        int a = 10;
        int b = 0;

        // act
        int result = calc.add(a, b);

        // assert
        assertEquals(10, result);
    }

}