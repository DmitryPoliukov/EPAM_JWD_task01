/*Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.epamtc.poliukov.tasks01.task3;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task3 {
    private double readingArea() {
        while (true) {
            System.out.println("Введите значение площади квадрата:");
            double area = CustomScanner.doubleScanner();
            if (area > 0) {
                return area;
            } else System.out.println("Некорректное значение.");
        }
    }

    private double secondArea(double firstArea) {
        double radius = Math.sqrt(firstArea) / 2;
        return 2 * Math.pow(radius, 2);
    }


    public void execute() {
        double firstArea = readingArea();
        System.out.printf("Площадь вписанного квадрата %.4f %n", secondArea(firstArea));
        double result = firstArea / (secondArea(firstArea));
        System.out.printf("Плошадь вписанного квадрата меньше площади заданного в %.2f раз", result);
    }
}
