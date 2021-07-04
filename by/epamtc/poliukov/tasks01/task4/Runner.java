package by.epamtc.poliukov.tasks01.task4;

public class Runner {
    public static void main(String[] args) {
        EvenNumbers evenNumbers = new EvenNumbers();

        System.out.println("Enter four integers:");
        int[] arr = evenNumbers.readingArray();
        System.out.println(evenNumbers.result(arr));
    }
}
