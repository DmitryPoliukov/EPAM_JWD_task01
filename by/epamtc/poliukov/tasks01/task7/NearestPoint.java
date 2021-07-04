/*Ддет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
моменту
 */
package by.epamtc.poliukov.tasks01.task7;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class NearestPoint {

    public  Point readingPointA() {
        double xPointA = CustomScanner.doubleScanner("Enter coordinate х point A");
        double yPointA = CustomScanner.doubleScanner("Enter coordinate y point A");
        return new Point(xPointA, yPointA);
    }

    public Point readingPointB() {
        double xPointB = CustomScanner.doubleScanner("Enter coordinate х point B");
        double yPointB = CustomScanner.doubleScanner("Enter coordinate y point B");
        return new Point(xPointB, yPointB);
    }

    private double distance(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Point nearestPoint(Point A, Point B) {
        double distanceA = distance(A.getX(), A.getY());
        double distanceB = distance(B.getX(), B.getY());
        if(distanceA <= distanceB) {
            return A;
        }
        else {
            return B;
        }
    }
}
