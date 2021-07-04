package by.epamtc.poliukov.tasks01.task4;

import org.junit.Assert;
import org.junit.Test;

public class EvenNumbersTest {
    EvenNumbers evenNumbers = new EvenNumbers();

    @Test
    public void result() {
        int[] array = {-34, -2, 0, 17};
        boolean actual = evenNumbers.result(array);
        Assert.assertTrue(actual);
    }
}