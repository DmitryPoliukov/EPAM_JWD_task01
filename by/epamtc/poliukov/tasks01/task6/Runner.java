package by.epamtc.poliukov.tasks01.task6;

public class Runner {
    public static void main(String[] args) {
        Task6 task6 = new Task6();

        int allSec = task6.readSec();
        int[] resultArray = task6.resArray(allSec);
        System.out.printf("It's been  %s h. %s min. %s sec. since the beginning of the day",
                resultArray[0], resultArray[1], resultArray[2]);
    }
}
