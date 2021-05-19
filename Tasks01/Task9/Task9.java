/*Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */
package Tasks01.Task9;

import Tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task9 {

    private static double readingR() {
        while (true) {
            System.out.println("Введите значение радиуса:");
            try{
                double r = Scanners.doubleScanner();
                if(r > 0){
                    return r;
                }
                else System.out.println("Некорректное значение.");
            }
            catch (InputMismatchException e) {
                System.out.println("Некорректное значение.");
            }
        }
    }

    private static void calculation(double r) {
        double length = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(String.format("Длина окружности равна %.4f, площадь круга равно %.4f", length, area));

    }
    public static void main(String[] args) {
    calculation(readingR());
    }
}
