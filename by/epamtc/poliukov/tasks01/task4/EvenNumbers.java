/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package by.epamtc.poliukov.tasks01.task4;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class EvenNumbers {

    public int[] readingArray() {
        int[] arrayOfInt = new int[4];
        for (int i = 0; i < 4; i++) {
            arrayOfInt[i] = CustomScanner.intScanner("");
        }
        return arrayOfInt;
    }

    public boolean result(int[] arr) {
        int counter = 0;
        for (int i = 0; i < 4; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        return counter > 1;
    }
}
