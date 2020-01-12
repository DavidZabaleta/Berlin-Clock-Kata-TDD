package com.sofka.berlin_clock_kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {

    private BerlinClock berlinClock;

    @Before
    public void setUp() throws Exception {
        berlinClock = new BerlinClock();
    }

    @Test
    public void methodSingleMinutesRowShouldReturnOOOOWhenTheTimeIs00h00m00s() {
        String time = "00:00:00";
        String expectResult = "OOOO";

        String result = berlinClock.singleMinutesRow(time);

        Assert.assertEquals(expectResult, result);
    }

    @Test
    public void methodSingleMinutesRowShouldReturnYYYYWhenTheTimeIs23h59m59s() {
        String time = "23:59:59";
        String expectResult = "YYYY";

        String result = berlinClock.singleMinutesRow(time);

        Assert.assertEquals(expectResult, result);
    }

    @Test
    public void methodSingleMinutesRowShouldReturnYYDDWhenTheTimeIs12h32m00s() {
        String time = "12:32:00";
        String expectResult = "YYOO";

        String result = berlinClock.singleMinutesRow(time);

        Assert.assertEquals(expectResult, result);
    }

    @Test
    public void methodSingleMinutesRowShouldReturnYYYYWhenTheTimeIs12h34m00s() {
        String time = "12:34:00";
        String expectResult = "YYYY";

        String result = berlinClock.singleMinutesRow(time);

        Assert.assertEquals(expectResult, result);
    }

    @Test
    public void methodSingleMinutesRowShouldReturnYYYYWhenTheTimeIs12h35m00s() {
        String time = "12:35:00";
        String expectResult = "OOOO";

        String result = berlinClock.singleMinutesRow(time);

        Assert.assertEquals(expectResult, result);
    }

}
