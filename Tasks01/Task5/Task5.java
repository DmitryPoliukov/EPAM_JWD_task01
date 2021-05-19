/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
числу).
 */

package Tasks01.Task5;

import Tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task5 {
    private static int readingNumber() {
        while (true) {
            try {
                System.out.println("Введите целое число:");
                return Scanners.intScanner();
            } catch (InputMismatchException e) {
                System.out.println("Некорректное значение.");
            }
        }
    }

    private static boolean isPerfectNumber(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum == a;
    }

    public static void main(String[] args) {
        int validNumber = readingNumber();
        System.out.println(isPerfectNumber(validNumber));
    }
}