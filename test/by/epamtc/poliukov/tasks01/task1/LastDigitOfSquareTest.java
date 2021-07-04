package by.epamtc.poliukov.tasks01.task1;

import org.junit.Assert;
import org.junit.Test;

public class LastDigitOfSquareTest {
    LastDigitOfSquare lastDigitOfSquare = new LastDigitOfSquare();

    @Test
    public void lastDigitOfSquare() {
        int actual = lastDigitOfSquare.lastDigitOfSquare(-289);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }


}