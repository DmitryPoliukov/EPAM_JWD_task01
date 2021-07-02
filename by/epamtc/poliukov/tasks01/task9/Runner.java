package by.epamtc.poliukov.tasks01.task9;

public class Runner {
    public static void main(String[] args) {
        Task9 task9 = new Task9();

        double radius = task9.readingR();
        double length = task9.calculatingLength(radius);
        double area = task9.calculatingArea(radius);
        System.out.printf("The circumference is %.4f, the area of the circle is %.4f", length, area);
    }
}
