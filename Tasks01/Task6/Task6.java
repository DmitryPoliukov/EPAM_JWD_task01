/*Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
моменту
 */
package Tasks01.Task6;

import Tasks01.Scanners.Scanners;

public class Task6 {

    private static int readingSec() {
        int seconsInDay = 86400;
        while (true) {
            System.out.println("Введите количество секунд с начала суток:");
            int allSec = Scanners.intScanner();
            if (allSec < 0 || allSec > seconsInDay) {
                System.out.println("Некорректное значение");
            } else return allSec;
        }
    }

    private static int [] resArray(int allSec) {
        int hours = allSec / 3600;
        int minutes = (allSec - hours * 3600) / 60;
        int seconds = allSec - hours *3600 - minutes * 60;
        return new int[] { hours, minutes, seconds };
    }

    public static void main(String[] args) {
       int[] resultArray = resArray(readingSec());
       System.out.printf("С начала суток прошло %s часов, %s минут, %s секунд.", resultArray[0], resultArray[1], resultArray[2]);
    }
}
