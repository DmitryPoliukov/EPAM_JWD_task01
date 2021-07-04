package by.epamtc.poliukov.tasks01.task5;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {
    PerfectNumber perfectNumber = new PerfectNumber();

    @Test
    public void isPerfectNumber() {
        int perfectNumber = 33550336;
        boolean actual = this.perfectNumber.isPerfectNumber(perfectNumber);
        Assert.assertTrue(actual);
    }

    @Test
    public void isPerfectForNegativeNumber() {
        int perfectNumber = -8;
        boolean expected = false;
        boolean actual = this.perfectNumber.isPerfectNumber(perfectNumber);
        Assert.assertEquals(expected, actual);
    }
}