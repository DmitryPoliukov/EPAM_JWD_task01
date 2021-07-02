/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
числу).
 */

package by.epamtc.poliukov.tasks01.task5;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task5 {

    public int readPositiveNumber() {
         return CustomScanner.positiveIntScanner("Enter a positive integer:");
        }

    public boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}