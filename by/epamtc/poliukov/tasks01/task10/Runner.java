package by.epamtc.poliukov.tasks01.task10;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        CalculatorTangent calculatorTangent = new CalculatorTangent();
        double firstValue = calculatorTangent.initFirst();
        double lastValue = calculatorTangent.initLast(firstValue);
        double step = calculatorTangent.initStep();
        System.out.println("Angle in radians:   Tangent:");
        Map<Double, Double> resultTangent = calculatorTangent.calculation(firstValue, lastValue, step);
        for (Map.Entry<Double, Double> entry : resultTangent.entrySet()) {
           System.out.printf("%.2f                 %.4f\n", entry.getKey(), entry.getValue());

        }
    }
}
