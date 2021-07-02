package by.epamtc.poliukov.tasks01.task2;

public class Runner {
    public static void main(String[] args) {
        Task2 task2 = new Task2();

        int year = task2.readYear();
        int month = task2.readMonth();
        System.out.println(task2.isLeap(year)? "Leap year" : "Non-leap year");
        int daysInMonth = task2.daysInMonth(month, year);
        System.out.println("Days in the month: " + daysInMonth);
    }
}
