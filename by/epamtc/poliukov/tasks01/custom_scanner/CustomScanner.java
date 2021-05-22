package by.epamtc.poliukov.tasks01.custom_scanner;

import java.util.Scanner;

public class CustomScanner {

    public static int intScanner() {
        Scanner intScanner = new Scanner(System.in);
        while(!intScanner.hasNextInt()) {
            System.out.println("Пожалуйста, введите целое число.");
            intScanner.next();
        }
        return intScanner.nextInt();
    }

    public static double doubleScanner() {
        Scanner doubleScanner = new Scanner(System.in);
        while(!doubleScanner.hasNextDouble()) {
            System.out.println("Пожалуйста, введите вещественное число.");
            doubleScanner.next();
        }
        return doubleScanner.nextDouble();
    }
}
