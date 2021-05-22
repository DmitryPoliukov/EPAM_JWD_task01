/*Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */
package by.epamtc.poliukov.tasks01.task9;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task9 {

    private double readingR() {
        while (true) {
            System.out.println("Введите значение радиуса:");
                double r = CustomScanner.doubleScanner();
                if(r > 0){
                    return r;
                }
                else System.out.println("Некорректное значение.");
        }
    }

    private double calculatingLength(double r) {
        return 2 * Math.PI * r;
    }

    private double calculatingArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public void execute() {
        double radius = readingR();
        double length = calculatingLength(radius);
        double area = calculatingArea(radius);
        System.out.printf("Длина окружности равна %.4f, площадь круга равна %.4f", length, area);
    }
}
