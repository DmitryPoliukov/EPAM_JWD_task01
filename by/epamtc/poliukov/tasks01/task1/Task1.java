
/*Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
квадрата.
 */

package by.epamtc.poliukov.tasks01.task1;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task1 {
    private int lastDigit(int a) {
        return a % 10;
    }

    private int lastDigitOfSquare(int b) {
        return (int) (Math.pow(b, 2) % 10);
    }

    public void execute() {
        System.out.println("Введите целое число: ");
        int inputNumber = CustomScanner.intScanner();
        int lastDigit = lastDigit(inputNumber);
        int result = lastDigitOfSquare(lastDigit);
        System.out.println("Последняя цифра квадрата числа: " + result);
    }
}
