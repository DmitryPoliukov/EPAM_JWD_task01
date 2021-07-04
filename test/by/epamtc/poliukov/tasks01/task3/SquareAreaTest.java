package by.epamtc.poliukov.tasks01.task3;

import org.junit.Assert;
import org.junit.Test;

public class SquareAreaTest {
    SquareArea squareArea = new SquareArea();

    @Test
    public void secondArea() {
        double secondArea = squareArea.secondArea(15.2);
        double expected = 7.6;
        Assert.assertEquals(expected, secondArea, 0.0001);
    }
}