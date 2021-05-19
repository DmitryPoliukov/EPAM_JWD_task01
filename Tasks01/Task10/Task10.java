package Tasks01.Task10;

import Tasks01.Scanners.Scanners;

public class Task10 {
    private static double first;
    private static double last;
    private static double step;

    private static void initInterval(){
    initFirst();
    initLast();
    initStep();
    }

    private static void initFirst(){
        System.out.println("Введите начальное значение интервала:");
        first = Scanners.doubleScanner();
    }

    private static void initLast(){
        boolean isValidLast = false;
        do {
            System.out.println("Введите значение конца интервала:");
            last = Scanners.doubleScanner();
            if(last <= first){
                System.out.println("Некорректное значение.");
            }
            else isValidLast = true;
            }
        while (!isValidLast);
    }

    private static void initStep(){
        System.out.println("Введите значение шага:");
        step = Scanners.doubleScanner();
    }

    private static void printingResults(){
        System.out.println("Угол в радианах:   Значение тангенса:");
        for(; first <= last; first += step){
        System.out.println(String.format("%.2f                 %.4f", first, Math.tan(first)));
        }
    }

    public static void main(String[] args) {
    initInterval();
    printingResults();
    }
}
