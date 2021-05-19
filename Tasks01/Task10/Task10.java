/*
 Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции.
 F(x) = tg(x);
 */
package Tasks01.Task10;

import Tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task10 {
    private static double first;
    private static double last;
    private static double step;

    private static void initInterval() {
    initFirst();
    initLast();
    initStep();
    }

    private static void initFirst() {
        while(true) {
            System.out.println("Введите начальное значение интервала в радианах:");
            try {
                first = Scanners.doubleScanner();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректное значение.");
            }
        }
    }

    private static void initLast() {
        boolean isValidLast = false;
        do {
            System.out.println("Введите значение конца интервала в радианах:");
                try{
                    last = Scanners.doubleScanner();
                    if(last <= first) {
                        System.out.println("Некорректное значение.");
                    }
                    else isValidLast = true;
                }
                catch(InputMismatchException e) {
                    System.out.println("Некорректное значение.");
                }
            }
        while (!isValidLast);
    }

    private static void initStep() {
        while(true) {
            System.out.println("Введите значение шага в радианах:");
            try {
                step = Scanners.doubleScanner();
                if(step > 0) {
                    break;
                }
                else System.out.println("Некорректное значение.");
            } catch (InputMismatchException e) {
                System.out.println("Некорректное значение.");
            }
        }
    }

    private static void printingResults() {
        System.out.println("Угол в радианах:   Значение тангенса:");
        for(; first <= last; first += step){
        System.out.println(String.format("%.2f                 %.4f", first, Math.tan(first)));
        }
    }

    public static void main(String[] args) {
    initInterval();
    printingResults();
    }
}
