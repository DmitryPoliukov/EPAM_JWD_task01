package by.epamtc.poliukov.tasks01.task10;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;


public class CalculatorTangentTest {
    CalculatorTangent calculatorTangent = new CalculatorTangent();

    @Test
    public void calculation() {
        Map<Double, Double> expected = new TreeMap<>();
        {
            expected.put(1.0, 1.5574077246549023);
            expected.put(2.0, -2.185039863261519);
            expected.put(3.0, -0.1425465430742778);
            expected.put(4.0, 1.1578212823495775);
            expected.put(5.0, -3.380515006246586);
        }
        Map<Double, Double> actual = calculatorTangent.calculation(1, 5, 1);
        Assert.assertEquals(expected, actual);
    }
}