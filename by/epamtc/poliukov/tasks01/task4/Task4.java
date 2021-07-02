/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package by.epamtc.poliukov.tasks01.task4;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task4 {

    public double[] readingArray() {
        double[] arrayOfDouble = new double[4];
        for (int i = 0; i < 4; i++) {
            arrayOfDouble[i] = CustomScanner.doubleScanner("");
        }
        return arrayOfDouble;
    }

    public boolean result(double[] arr) {
        int counter = 0;
        for (int i = 0; i < 4; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        return counter > 1;
    }
}
