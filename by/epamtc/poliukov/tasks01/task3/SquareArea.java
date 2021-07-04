/*Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.epamtc.poliukov.tasks01.task3;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class SquareArea {
    public double readArea() {
        double area = CustomScanner.positiveDoubleScanner("Enter a value for the area of the square");
        return area;
    }

    public double secondArea(double firstArea) {
        double radius = Math.sqrt(firstArea) / 2;
        return 2 * Math.pow(radius, 2);
    }

}
