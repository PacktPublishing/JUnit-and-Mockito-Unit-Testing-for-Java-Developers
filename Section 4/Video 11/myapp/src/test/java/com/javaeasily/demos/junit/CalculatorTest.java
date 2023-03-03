package com.javaeasily.demos.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // arrange
        int a = 10;
        int b = 20;

        // act
        int result = Calculator.add(a, b);

        // assert
        assertEquals(30, result);
    }

}