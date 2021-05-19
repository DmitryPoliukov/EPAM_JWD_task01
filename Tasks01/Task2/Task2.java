/* Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
месяце и корректно определялись все високосные года.
 */

package Tasks01.Task2;

import Tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task2 {

    private static int validationOfYear() {
        int year = -1;
        while (year < 0) {
            System.out.println("Введите год:");
            try {
                year = Scanners.intScanner();
            }
            catch (InputMismatchException e){
                System.out.println("Некооректное значение.");
            }
            if (year < 0) {
                System.out.println("Некооректное значение.");
            }
        }
        return year;
    }

    private static int validationOfMonth() {
        int month;
        while (true) {
            System.out.println("Введите номер месяца:");
            month = Scanners.intScanner();
            if (!(month > 0 & month <= 12)) {
                System.out.println("Некорректное значение.");
            } else return month;
        }
    }

    private static boolean isLeap(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    private static int daysInMonth(int validMonth, int validYear) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(isLeap(validYear)){
            days[1] = 29;
        }
        return days[validMonth-1];
    }


    public static void main(String[] args) {
        int validYear = validationOfYear();
        int validMonth = validationOfMonth();
        System.out.println(isLeap(validYear)? "Високосный год" : "Год невисикосный");
        System.out.println("Количество дней в месяце: " + daysInMonth(validMonth, validYear));
    }
}
