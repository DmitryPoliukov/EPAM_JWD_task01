/*Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */
package by.epamtc.poliukov.tasks01.task9;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class CircleParameters {

    public double readingR() {
        double radius = CustomScanner.positiveDoubleScanner("Enter a value for the radius:");
        return radius;
    }

    public double calculatingLength(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculatingArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
