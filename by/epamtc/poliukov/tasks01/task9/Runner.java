package by.epamtc.poliukov.tasks01.task9;

public class Runner {
    public static void main(String[] args) {
        CircleParameters circleParameters = new CircleParameters();

        double radius = circleParameters.readingR();
        double length = circleParameters.calculatingLength(radius);
        double area = circleParameters.calculatingArea(radius);
        System.out.printf("The circumference is %.4f, the area of the circle is %.4f", length, area);
    }
}
