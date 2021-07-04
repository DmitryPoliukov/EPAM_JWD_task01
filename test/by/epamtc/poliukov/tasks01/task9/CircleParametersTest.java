package by.epamtc.poliukov.tasks01.task9;

import org.junit.Assert;
import org.junit.Test;

public class CircleParametersTest {
    CircleParameters circleParameters = new CircleParameters();

    @Test
    public void calculatingLength() {
        double expected = 20.1;
        double actual = circleParameters.calculatingLength(3.2);
        Assert.assertEquals(expected, actual, 0.01);

    }

    @Test
    public void calculatingArea() {
        double expected = 211.234;
        double actual = circleParameters.calculatingArea(8.2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}