package by.epamtc.poliukov.tasks02.bean;

public class Ball {

    public Color color;
    public int weight;
    public final static int redWeight = 20;
    public final static int blueWeight = 25;
    public final static int whiteWeight = 30;
    public final static int greenWeight = 35;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }
}
