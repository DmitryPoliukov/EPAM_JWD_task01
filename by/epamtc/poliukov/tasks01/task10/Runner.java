package by.epamtc.poliukov.tasks01.task10;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Task10 task10 = new Task10();
        double firstValue = task10.initFirst();
        double lastValue = task10.initLast(firstValue);
        double step = task10.initStep();
        System.out.println("Angle in radians:   Tangent:");
        Map<Double, Double> resultTangent = task10.calculation(firstValue, lastValue, step);
        for (Map.Entry<Double, Double> entry : resultTangent.entrySet()) {
            System.out.printf("%.2f                 %.4f\n", entry.getKey(), entry.getValue());
        }
    }
}
