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
            "12:07:32, YYOO",
            "23:59:59, YYYY",
            "12:32:00, YYOO",
            "12:34:00, YYYY",
            "12:35:00, OOOO",
    })
    public void methodSingleMinutesRowShouldReturnExpectedResultWhenEnterTime(String time, String expectedResult) {
        String result = berlinClock.singleMinutesRow(time);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    @Parameters({
            "00:00:00, OOOOOOOOOOO",
            "03:42:20, YYRYYRYYOOO",
            "23:59:59, YYRYYRYYRYY",
            "12:04:00, OOOOOOOOOOO",
            "12:23:00, YYRYOOOOOOO",
            "12:35:00, YYRYYRYOOOO",
    })
    public void methodFiveMinutesRowShouldReturnExpectedResultWhenEnterTime(String time, String expectedResult) {
        String result = berlinClock.fiveMinutesRow(time);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    @Parameters({
            "00:00:00, OOOO",
            "07:32:45, RROO",
            "23:59:59, RRRO",
            "02:04:00, RROO",
            "08:23:00, RRRO",
            "14:35:00, RRRR",
    })
    public void methodSingleHoursRowShouldReturnExpectedResultWhenEnterTime(String time, String expectedResult) {
        String result = berlinClock.singleHoursRow(time);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    @Parameters({
            "00:00:00, OOOO",
            "13:32:45, RROO",
            "23:59:59, RRRR",
            "02:04:00, OOOO",
            "08:23:00, ROOO",
            "16:35:00, RRRO",
    })
    public void methodFiveHoursRowShouldReturnExpectedResultWhenEnterTime(String time, String expectedResult) {
        String result = berlinClock.fiveHoursRow(time);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    @Parameters({
            "00:00:00, Y",
            "23:59:59, O",
            "20:16:32, Y",
            "01:53:18, Y",
            "16:22:45, O",
            "00:05:07, O",
    })
    public void methodSecondsLampShouldReturnExpectedResultWhenEnterTime(String time, String expectedResult) {
        String result = berlinClock.secondsLamp(time);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    @Parameters({
            "00:00:00, YOOOOOOOOOOOOOOOOOOOOOOO",
            "23:59:59, ORRRRRRROYYRYYRYYRYYYYYY",
            "16:50:06, YRRROROOOYYRYYRYYRYOOOOO",
            "11:37:01, ORROOROOOYYRYYRYOOOOYYOO",
    })
    public void methodEntireBerlinClockShouldReturnExpectedResultWhenEnterTime(String time, String expectedResult) {
        String result = berlinClock.entireBerlinClock(time);

        Assert.assertEquals(expectedResult, result);
    }
}
