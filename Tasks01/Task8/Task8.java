/* Вычислить значение функции:
    если х >= 3 F(x) = -x2 + 3x + 9
    если x < 3 F(x) = 1/(x3-6)
 */

package Tasks01.Task8;

import Tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task8 {

    private static double readingX() {
        while(true) {
            try {
                System.out.println("Введите значение аргумента функции:");
                return Scanners.doubleScanner();
            }
            catch (InputMismatchException e) {
                System.out.println("Некорректное значение.");
            }
        }
    }

    private static double calculation(double x) {
        if(x >= 3){
            return -Math.pow(x, 2) + 3 * x + 9;
        }
        else  return (1 / (Math.pow(x, 3) - 6));
    }

    public static void main(String[] args) {
        double function = calculation(readingX());
        System.out.println(String.format("Значение функции равно %.3f", function));
    }
}
