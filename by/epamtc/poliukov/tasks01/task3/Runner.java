package by.epamtc.poliukov.tasks01.task3;

public class Runner {
    public static void main(String[] args) {
        SquareArea squareArea = new SquareArea();

        double firstArea = squareArea.readArea();
        System.out.printf("Inscribed square %.4f %n", squareArea.secondArea(firstArea));
        double result = firstArea / (squareArea.secondArea(firstArea));
        System.out.printf("The area of the inscribed square is less than the area specified in %.2f times", result);
    }
}
