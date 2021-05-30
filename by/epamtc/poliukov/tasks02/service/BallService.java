package by.epamtc.poliukov.tasks02.service;

import by.epamtc.poliukov.tasks02.bean.Ball;
import by.epamtc.poliukov.tasks02.bean.Basket;
import by.epamtc.poliukov.tasks02.bean.Color;
import java.util.ArrayList;

public class BallService {
    public Basket firstBasket = new Basket();

    public ArrayList<Ball> analyzeInput(String inputChar){

        switch (inputChar){
            case "r":
                firstBasket.arrayBalls.add(createBall(Color.Red));
                break;
            case "b":
                firstBasket.arrayBalls.add(createBall(Color.Blue));
                break;
            case "w":
                firstBasket.arrayBalls.add(createBall(Color.White));
                break;
            case "g":
                firstBasket.arrayBalls.add(createBall(Color.Green));
                break;
            case "basket":
            break;
        }
        return firstBasket.arrayBalls;
    }

    public Ball createBall(Color color){
        switch (color){
            case Red:
                return new Ball(Color.Red, Ball.redWeight);
            case Blue:
                return new Ball(Color.Blue, Ball.blueWeight);
            case White:
                return new Ball(Color.White, Ball.whiteWeight);
            default:
                return new Ball(Color.Blue, Ball.greenWeight);
        }
    }

    public int blueBallsCounter(ArrayList<Ball> basket) {
        int blueBallsCounter = 0;
        for(Ball ball: basket) {
            if(ball.color.equals(Color.Blue)){
                blueBallsCounter++;
            }
        }
        return blueBallsCounter;
    }

    public int totalWeightBasket(ArrayList<Ball> basket) {
        int totalWeight = 0;
        for(Ball ball: basket) {
            totalWeight += ball.weight;
        }
        return totalWeight;
    }

}
