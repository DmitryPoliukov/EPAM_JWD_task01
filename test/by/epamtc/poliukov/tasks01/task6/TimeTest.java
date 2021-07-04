package by.epamtc.poliukov.tasks01.task6;

import org.junit.Assert;
import org.junit.Test;

public class TimeTest {
    Time time = new Time();

    @Test
    public void resArray() {
        int[] expected = {1, 6, 40};
        int[] actual = time.resArray(4000);
        Assert.assertArrayEquals(expected, actual);
    }
}