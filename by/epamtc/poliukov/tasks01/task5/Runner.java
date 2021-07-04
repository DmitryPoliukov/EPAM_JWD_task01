package by.epamtc.poliukov.tasks01.task5;

public class Runner {
    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();

        int validNumber = perfectNumber.readIntNumber();
        boolean isPerfectNumber = perfectNumber.isPerfectNumber(validNumber);
        System.out.println(isPerfectNumber);
    }
}
