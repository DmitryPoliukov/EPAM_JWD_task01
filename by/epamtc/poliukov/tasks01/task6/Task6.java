/*Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
моменту
 */
package by.epamtc.poliukov.tasks01.task6;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task6 {

    private int readingSec() {
        int seconsInDay = 86400;
        while (true) {
            System.out.println("Введите количество секунд с начала суток:");
            int allSec = CustomScanner.intScanner();
            if (allSec < 0 || allSec > seconsInDay) {
                System.out.println("Некорректное значение");
            } else return allSec;
        }
    }

    private int [] resArray(int allSec) {
        int hours = allSec / 3600;
        int minutes = (allSec - hours * 3600) / 60;
        int seconds = allSec - hours *3600 - minutes * 60;
        return new int[] { hours, minutes, seconds };
    }

    public void execute() {
       int[] resultArray = resArray(readingSec());
       System.out.printf("С начала суток прошло %s ч. %s мин. %s сек.", resultArray[0], resultArray[1], resultArray[2]);
    }
}
