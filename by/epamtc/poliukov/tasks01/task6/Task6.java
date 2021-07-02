/*Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
моменту
 */
package by.epamtc.poliukov.tasks01.task6;

import by.epamtc.poliukov.tasks01.custom_scanner.CustomScanner;

public class Task6 {

    public int readSec() {
        int secondsInDay = 86400;
        int allSec = CustomScanner.intInRangeScanner("Enter the number of seconds since the " +
                "beginning of the day:", 0, secondsInDay);
        return allSec;
    }

    public int [] resArray(int allSec) {
        int hours = allSec / 3600;
        int minutes = (allSec - hours * 3600) / 60;
        int seconds = allSec - hours * 3600 - minutes * 60;
        return new int[] { hours, minutes, seconds };
    }

}
