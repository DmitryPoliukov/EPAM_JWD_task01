/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
числу).
 */

package by.epamtc.poliukov.tasks01.task5;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task5 {
    private static int readingNumber() {
         System.out.println("Введите целое число:");
         return CustomScanner.intScanner();
        }

    private boolean isPerfectNumber(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum == a;
    }

    public void execute() {
        int validNumber = readingNumber();
        boolean isPerfectNumber = isPerfectNumber(validNumber);
        System.out.println(isPerfectNumber);
    }
}