package by.epamtc.poliukov.tasks01.task8;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorFunctionValueTest {


    private double argument;
    private double value;
    @Parameters public static Collection<Double[]> arguments() {
        return Arrays.asList(new Double[][] {
            {0.0, -0.1667},
            {4.0, 5.0}
            });
        }

    public CalculatorFunctionValueTest(double argument, double value) {
        this.argument = argument;
        this.value = value;
    }

    @Test
    public void calculation() {
        CalculatorFunctionValue calculatorFunctionValue = new CalculatorFunctionValue();
        double expected = this.value;
        double actual = calculatorFunctionValue.calculation(this.argument);
        Assert.assertEquals(expected, actual, 0.001);
    }


}