package com.javaeasily.demos.junit;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        try {
            // giving bad input to SUT
            Assert.fail("Failing the test!");
        } catch (ValidationException e)  {

        }
    }

}