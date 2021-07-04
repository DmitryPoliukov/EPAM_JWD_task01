
/*Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
квадрата.
 */

package by.epamtc.poliukov.tasks01.task1;

public class LastDigitOfSquare {
    public int lastDigitOfSquare(int inputNumber) {
        int lasDigit = (int) (Math.pow(inputNumber, 2) % 10);
        return lasDigit;
    }
}
