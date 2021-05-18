package Tasks01.Task8;

import Tasks01.Scanners.Scanners;

public class Task8 {

    private static double readingX(){
        System.out.println("Введите значение аргумента функции:");
        return Scanners.doubleScanner();
    }

    private static double calculation(double x){
        if(x >= 3){
            return -Math.pow(x, 2) + 3 * x + 9;
        }
        else  return (1 / (Math.pow(x, 3) - 6));
    }

    public static void main(String[] args) {
        double function = calculation(readingX());
        System.out.println(String.format("Значение функции равно %.3f", function));
    }
}
