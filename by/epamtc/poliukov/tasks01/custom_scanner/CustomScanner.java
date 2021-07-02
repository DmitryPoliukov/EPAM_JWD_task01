package by.epamtc.poliukov.tasks01.custom_scanner;

import java.util.Scanner;

public class CustomScanner {

    public static int intScanner(String message) {
        System.out.println(message);
        Scanner intScanner = new Scanner(System.in);
        while(!intScanner.hasNextInt()) {
            System.out.println("Please, enter an integer");
            intScanner.next();
        }
        return intScanner.nextInt();
    }

    public static double doubleScanner(String message) {
        Scanner doubleScanner = new Scanner(System.in);
        System.out.println(message);
        while(!doubleScanner.hasNextDouble()) {
            System.out.println("Please enter a real number.");
            doubleScanner.next();
        }
        return doubleScanner.nextDouble();
    }

    public static int intInRangeScanner(String message, int left, int right) {
        Scanner intInRangeScanner = new Scanner(System.in);
        System.out.println(message);
        while(!intInRangeScanner.hasNextInt()) {
            System.out.println("Please, enter an integer");
            intInRangeScanner.next();
        }
        int data = intInRangeScanner.nextInt();
        if(data < left || data > right) {
            System.out.println("Invalid value");
            data = intInRangeScanner(message, left, right);
        }
        return data;
    }

    public static double doubleInRangeScanner(String message, double left, double right) {
        Scanner doubleInRangeScanner = new Scanner(System.in);
        System.out.println(message);
        while(!doubleInRangeScanner.hasNextDouble()) {
            System.out.println("Please enter a real number.");
            doubleInRangeScanner.next();
        }
        double data = doubleInRangeScanner.nextDouble();
        if(data < left || data > right) {
            System.out.println("Invalid value");
            data = doubleInRangeScanner(message, left, right);
        }
        return data;
    }

    public static int positiveIntScanner(String message) {
        Scanner positiveIntScanner = new Scanner(System.in);
        System.out.println(message);
        while(!positiveIntScanner.hasNextInt()) {
            System.out.println("Please, enter an integer");
            positiveIntScanner.next();
        }
        int data = positiveIntScanner.nextInt();
        if(data < 0) {
            System.out.println("Invalid value");
            data = positiveIntScanner(message);
        }
        return data;
    }

    public static int positiveDoubleScanner(String message) {
        Scanner positiveDoubleScanner = new Scanner(System.in);
        System.out.println(message);
        while(!positiveDoubleScanner.hasNextDouble()) {
            System.out.println("Please enter a real number.");
            positiveDoubleScanner.next();
        }
        int data = positiveDoubleScanner.nextInt();
        if(data < 0) {
            System.out.println("Invalid value");
            data = positiveDoubleScanner(message);
        }
        return data;
    }

}
