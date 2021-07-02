package by.epamtc.poliukov.tasks01.task3;

public class Runner {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        double firstArea = task3.readArea();
        System.out.printf("Inscribed square %.4f %n", task3.secondArea(firstArea));
        double result = firstArea / (task3.secondArea(firstArea));
        System.out.printf("The area of the inscribed square is less than the area specified in %.2f times", result);
    }
}
