/*
 Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции.
 F(x) = tg(x);
 */
package by.epamtc.poliukov.tasks01.task10;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task10 {
    private double first;
    private double last;
    private double step;

    private void initInterval() {
    initFirst();
    initLast();
    initStep();
    }

    private void initFirst() {
        System.out.println("Введите начальное значение интервала в радианах:");
        first = CustomScanner.doubleScanner();
    }

    private void initLast() {
        boolean isValidLast = false;
        do {
            System.out.println("Введите значение конца интервала в радианах:");
            last = CustomScanner.doubleScanner();
            if(last <= first) {
                System.out.println("Некорректное значение.");
            }
            else isValidLast = true;
            }
        while (!isValidLast);
    }

    private void initStep() {
        boolean isValidStep = false;
        while(!isValidStep) {
            System.out.println("Введите значение шага в радианах:");
            step = CustomScanner.doubleScanner();
            if(step > 0) {
                isValidStep = true;
            }
                else System.out.println("Некорректное значение.");
        }
    }

    private void printingResults() {
        System.out.println("Угол в радианах:   Значение тангенса:");
        for(; first <= last; first += step){
        System.out.printf("%.2f                 %.4f", first, Math.tan(first));
        }
    }

    public void execute() {
    initInterval();
    printingResults();
    }
}
