package com.sofka.berlin_clock_kata;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class BerlinClockTest {

    private BerlinClock berlinClock;

    @Before
    public void setUp() throws Exception {
        berlinClock = new BerlinClock();
    }

    @Test
    @Parameters({
            "00:00:00, OOOO",
            "23:59:59, YYYY",
            "12:32:00, YYOO",
            "12:34:00, YYYY",
            "12:35:00, OOOO",
    })
    public void methodSingleMinutesRowShouldReturnExpectedResultWhenEnterTime(String time, String expectedResult) {
        String result = berlinClock.singleMinutesRow(time);

        Assert.assertEquals(expectedResult, result);
    }

}
