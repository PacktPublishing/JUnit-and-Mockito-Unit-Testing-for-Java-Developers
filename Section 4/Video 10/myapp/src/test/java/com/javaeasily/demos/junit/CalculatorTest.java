package com.javaeasily.demos.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // arrange

        // act

        // assert
        assertNotNull(new Object());
        assertTrue("10 always equals 10", 10 == 11);
        assertNotEquals(1L, 2L);
    }

}