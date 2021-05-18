package Tasks01.Task7;

import Tasks01.Scanners.Scanners;

public class Solution {

    public static Point readingPointA(){
        System.out.println("Введите координату х точки А");
        double aX = Scanners.doubleScanner();
        System.out.println("Введите координату y точки А");
        double aY = Scanners.doubleScanner();
        return new Point(aX, aY);
    }

    private static Point readingPointB(){
        System.out.println("Введите координату х точки B");
        double bX = Scanners.doubleScanner();
        System.out.println("Введите координату y точки B");
        double bY = Scanners.doubleScanner();
        return new Point(bX, bY);
    }

    private static double distance(double x, double y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    private static int compare(double distanceA, double distanceB){
        if(distanceA < distanceB){
            return 1;
        }
        else if (distanceA == distanceB){
            return 0;
        }
        else return -1;
    }

    private static void printingResult(int compareNumber){
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

    public static void main(String[] args) {
        Point A = readingPointA();
        Point B = readingPointB();
        double distanceA = distance(A.getX(),A.getY());
        double distanceB = distance(B.getX(), B.getY());
        int compareNumber = compare(distanceA, distanceB);
        printingResult(compareNumber);





    }

}
