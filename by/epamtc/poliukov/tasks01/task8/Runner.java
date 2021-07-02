package by.epamtc.poliukov.tasks01.task8;

public class Runner {
    public static void main(String[] args) {
        Task8 task8 = new Task8();

        double function = task8.calculation(task8.readArgument());
        System.out.printf("The function value is %.3f", function);
    }
}
