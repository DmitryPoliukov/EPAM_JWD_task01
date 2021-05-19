/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package Tasks01.Task4;

import Tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task4 {
    private static double[] readingArray() {
        while (true) {
            System.out.println("Введите четыре числа:");
            try {
                double[] arrayOfDouble = new double[4];
                for (int i = 0; i < 4; i++) {
                    arrayOfDouble[i] = Scanners.doubleScanner();
                }
                return arrayOfDouble;
            } catch (InputMismatchException e) {
                System.out.println("Некорректное значение");
            }
        }
    }

    private static boolean result(double[] arr){
        int counter = 0;
        for (int i = 0; i < 4; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        return counter > 1;
    }

    public static void main(String[] args) {
        double[] arr = readingArray();
        System.out.println(result(arr));
    }
}
