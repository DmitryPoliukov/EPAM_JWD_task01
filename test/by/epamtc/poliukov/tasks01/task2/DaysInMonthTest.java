package by.epamtc.poliukov.tasks01.task2;

import org.junit.Assert;
import org.junit.Test;

public class DaysInMonthTest {
    DaysInMonth daysInMonth = new DaysInMonth();

    @Test
    public void isLeap() {
        boolean isLeap = daysInMonth.isLeap(2020);
        Assert.assertTrue(isLeap);
    }

    @Test
    public void daysInMonth() {
        int february = 2;
        int year = 2020;
        int daysInFebruary2020 = daysInMonth.daysInMonth(2, 2020);
        int expected = 29;
        Assert.assertEquals(expected, daysInFebruary2020);
    }
}