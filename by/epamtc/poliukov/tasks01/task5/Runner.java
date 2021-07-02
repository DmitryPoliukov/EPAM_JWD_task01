package by.epamtc.poliukov.tasks01.task5;

public class Runner {
    public static void main(String[] args) {
        Task5 task5 = new Task5();

        int validNumber = task5.readPositiveNumber();
        boolean isPerfectNumber = task5.isPerfectNumber(validNumber);
        System.out.println(isPerfectNumber);
    }
}
