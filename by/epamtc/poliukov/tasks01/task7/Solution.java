/*Ддет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
моменту
 */
package by.epamtc.poliukov.tasks01.task7;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Solution {

    public  Point readingPointA() {
        System.out.println("Введите координату х точки А");
        double xPointA = CustomScanner.doubleScanner();
        System.out.println("Введите координату y точки А");
        double yPointA = CustomScanner.doubleScanner();
        return new Point(xPointA, yPointA);
    }

    private Point readingPointB() {
        System.out.println("Введите координату х точки B");
        double xPointB = CustomScanner.doubleScanner();
        System.out.println("Введите координату y точки B");
        double yPointB = CustomScanner.doubleScanner();
        return new Point(xPointB, yPointB);
    }

    private double distance(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    // Слышал, что при сравнении надо возращать сам объект Point, но здесь же возможно равенство расстояний.
    private int compare(double distanceA, double distanceB) {
        return Double.compare(distanceB, distanceA);
    }

    private void printingResult(int compareNumber) {
        switch (compareNumber){
            case 1:
                System.out.println("Точка А ближе к началу координат");
                break;
            case 0:
                System.out.println("Точки расположены на одинаковом расстоянии от начала координат");
                break;
            case -1:
                System.out.println("Точка В расположена ближе к началу координат");
                break;
        }
    }

    public void execute() {
        Point pointA = readingPointA();
        Point pointB = readingPointB();
        double distanceA = distance(pointA.getX(), pointA.getY());
        double distanceB = distance(pointB.getX(), pointB.getY());
        int compareNumber = compare(distanceA, distanceB);
        printingResult(compareNumber);
    }
}
