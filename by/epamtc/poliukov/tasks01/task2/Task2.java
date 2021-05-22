/* Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
месяце и корректно определялись все високосные года.
 */

package by.epamtc.poliukov.tasks01.task2;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task2 {

    private int validationOfYear() {
        int year = -1;
        while (year < 0) {
            System.out.println("Введите год:");
            year = CustomScanner.intScanner();
            if (year < 0) {
                System.out.println("Некооректное значение.");
            }
        }
        return year;
    }

    private int validationOfMonth() {
        int month;
        while (true) {
            System.out.println("Введите номер месяца:");
            month = CustomScanner.intScanner();
            if (!(month > 0 & month <= 12)) {
                System.out.println("Некорректное значение.");
            } else return month;
        }
    }

    private boolean isLeap(int year) {
        boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        return isLeap;
    }

    private int daysInMonth(int validMonth, int validYear) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(isLeap(validYear)){
            days[1] = 29;
        }
        return days[validMonth-1];
    }


    public void execute() {
        int validYear = validationOfYear();
        int validMonth = validationOfMonth();
        System.out.println(isLeap(validYear)? "Високосный год" : "Год невисикосный");
        int daysInMonth = daysInMonth(validMonth, validYear);
        System.out.println("Количество дней в месяце: " + daysInMonth);
    }
}
