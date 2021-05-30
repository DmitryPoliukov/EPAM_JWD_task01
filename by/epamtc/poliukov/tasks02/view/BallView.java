package by.epamtc.poliukov.tasks02.view;

import java.util.Scanner;

public class BallView {
    Scanner stringScanner = new Scanner(System.in);

    public String readBall() {
        String inputChar;
        System.out.println("Enter the color of ball to add to basket \n" +
                " r - red,\n b - blue,\n w - white, \n g - green \n" +
                "basket - return data about filling the basket");
        switch (inputChar = stringScanner.nextLine()) {
            case "r":
            case "b":
            case "w":
            case "g":
            case "basket":
                return inputChar;
            default:
                System.out.println("Incorrect input");
                return readBall();
        }
    }

    public void printResult(int blueBallsCounter, int totalWeightBasket){
        System.out.printf("Quantity of blue balls - %d, total weight of balls in basket - %d", blueBallsCounter,totalWeightBasket);
    }

    public void printConfirmation(){
        System.out.println("Ball was added to basket");
    }
}
