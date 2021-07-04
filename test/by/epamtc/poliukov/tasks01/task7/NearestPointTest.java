package by.epamtc.poliukov.tasks01.task7;

import org.junit.Assert;
import org.junit.Test;

public class NearestPointTest {
    NearestPoint nearestPoint = new NearestPoint();

    @Test
    public void nearestPoint() {
        Point pointA = new Point(100,0);
        Point pointB = new Point(-2,2);
        Point expected = pointB;
        Point actual = nearestPoint.nearestPoint(pointA, pointB);
        Assert.assertEquals(expected, actual);
    }
}