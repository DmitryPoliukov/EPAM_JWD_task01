package by.epamtc.poliukov.tasks01.task1;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Runner {
    public static void main(String[] args) {
        LastDigitOfSquare lastDigitOfSquare = new LastDigitOfSquare();

        int inputNumber = CustomScanner.intScanner("Please, enter an integer");
        int result = lastDigitOfSquare.lastDigitOfSquare(inputNumber);
        System.out.println("The last digit of the square of the number: " + result);
    }
}
