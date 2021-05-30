package by.epamtc.poliukov.tasks02.controller;

import by.epamtc.poliukov.tasks02.bean.Ball;
import by.epamtc.poliukov.tasks02.service.BallService;
import by.epamtc.poliukov.tasks02.view.BallView;

import java.util.ArrayList;

public class BallController {
   public BallView ballView = new BallView();
   public BallService ballService = new BallService();
   private boolean isInterruptInput = false;

    public void execute() {
        while(!isInterruptInput) {
            String inputChar = ballView.readBall();
            ArrayList<Ball> arrayBalls = ballService.analyzeInput(inputChar);
            if (inputChar.equals("basket")) {
                isInterruptInput = true;
                int blueBallsCounter = ballService.blueBallsCounter(arrayBalls);
                int totalWeightBasket = ballService.totalWeightBasket(arrayBalls);
                ballView.printResult(blueBallsCounter, totalWeightBasket);
            }
            else{
                ballView.printConfirmation();
            }
        }




    }
}
