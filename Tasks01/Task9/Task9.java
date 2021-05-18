package Tasks01.Task9;

import Tasks01.Scanners.Scanners;

public class Task9 {

    private static double readingR(){
        System.out.println("Введите значение радиуса:");
        return Scanners.doubleScanner();
    }

    private static void calculation(double r){
        double length = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(String.format("Длина окружности равна %.4f, площадь круга равно %.4f", length, area));

    }
    public static void main(String[] args) {
    calculation(readingR());
    }
}
