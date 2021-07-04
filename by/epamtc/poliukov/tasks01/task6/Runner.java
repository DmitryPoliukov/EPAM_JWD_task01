package by.epamtc.poliukov.tasks01.task6;

public class Runner {
    public static void main(String[] args) {
        Time time = new Time();

        int allSec = time.readSec();
        int[] resultArray = time.resArray(allSec);
        System.out.printf("It's been  %s h. %s min. %s sec. since the beginning of the day",
                resultArray[0], resultArray[1], resultArray[2]);
    }
}
