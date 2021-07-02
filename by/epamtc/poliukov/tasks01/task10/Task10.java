/*
 Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции.
 F(x) = tg(x);
 */
package by.epamtc.poliukov.tasks01.task10;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

import java.util.Map;
import java.util.TreeMap;

public class Task10 {

    double initFirst() {
        double first = CustomScanner.doubleScanner("Enter the starting value for the spacing in radians:");
        return first;
    }

    double initLast(double first) {
        double last = CustomScanner.doubleInRangeScanner("Enter the end of the interval in radians:",
                first, Double.MAX_VALUE );
        return last;
    }

    double initStep() {
        double step = CustomScanner.positiveDoubleScanner("Enter the step value in radians:");
        return step;
    }

    Map<Double, Double> calculation(double first, double last, double step) {
        Map<Double, Double> resultTangent = new TreeMap<>();
        for(; first <= last; first += step){
            resultTangent.put(first, Math.tan(first));
        }
        return resultTangent;
    }
}
