/* Вычислить значение функции:
    если х >= 3 F(x) = -x2 + 3x + 9
    если x < 3 F(x) = 1/(x3-6)
 */

package by.epamtc.poliukov.tasks01.task8;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task8 {

    private double readingX() {
        System.out.println("Введите значение аргумента функции:");
        return CustomScanner.doubleScanner();
    }

    private double calculation(double x) {
        double result;
        if (x >= 3){
            result = -Math.pow(x, 2) + 3 * x + 9;
        }
        else {
            result = (1 / (Math.pow(x, 3) - 6));
        }
        return result;
    }

    public void execute() {
        double function = calculation(readingX());
        System.out.printf("Значение функции равно %.3f", function);
    }
}
