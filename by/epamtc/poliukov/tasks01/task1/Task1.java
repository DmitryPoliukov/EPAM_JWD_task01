
/*Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
квадрата.
 */

package by.epamtc.poliukov.tasks01.task1;

public class Task1 {
    public int lastDigitOfSquare(int inputNumber) {
        return (int) (Math.pow(inputNumber, 2) % 10);
    }
}
