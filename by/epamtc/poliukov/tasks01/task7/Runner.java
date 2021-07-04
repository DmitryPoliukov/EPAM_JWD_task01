package by.epamtc.poliukov.tasks01.task7;

public class Runner {
    public static void main(String[] args) {
        NearestPoint task7 = new NearestPoint();

        Point pointA = task7.readingPointA();
        Point pointB = task7.readingPointB();
        Point nearestPoint = task7.nearestPoint(pointA, pointB);
        System.out.println(nearestPoint + " is closer to the origin");


    }
}
