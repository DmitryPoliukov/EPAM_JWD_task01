/* Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
месяце и корректно определялись все високосные года.
 */

package by.epamtc.poliukov.tasks01.task2;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class DaysInMonth {

    public int readYear() {
        int year = CustomScanner.positiveIntScanner("Enter the year");
        return year;
    }

    public int readMonth() {
        int month = CustomScanner.intInRangeScanner("Enter the month number:", 1, 12);
        return month;
    }

    public boolean isLeap(int year) {
        boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        return isLeap;
    }

    public int daysInMonth(int validMonth, int year) {
        int[] daysPerMonths = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(isLeap(year)){
            daysPerMonths[1] = 29;
        }
        return daysPerMonths[validMonth-1];
    }
}
