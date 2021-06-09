package com.javaeasily.demos.mockito.myapp;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Calendar;

public class AppTest {

    @Test
    public void testIt() {
        Calendar mockCalendar = Mockito.mock(Calendar.class);
    }

}
