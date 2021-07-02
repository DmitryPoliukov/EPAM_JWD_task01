/* Вычислить значение функции:
    если х >= 3 F(x) = -x2 + 3x + 9
    если x < 3 F(x) = 1/(x3-6)
 */

package by.epamtc.poliukov.tasks01.task8;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task8 {

    public double readArgument() {
        return CustomScanner.doubleScanner("Enter the value of the function argument:");
    }

    public double calculation(double argument) {
        double result;
        if (argument >= 3){
            result = -Math.pow(argument, 2) + 3 * argument + 9;
        }
        else {
            result = (1 / (Math.pow(argument, 3) - 6));
        }
        return result;
    }

}
