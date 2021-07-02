package by.epamtc.poliukov.tasks01.task4;

public class Runner {
    public static void main(String[] args) {
        Task4 task4 = new Task4();

        System.out.println("Enter four numbers:");
        double[] arr = task4.readingArray();
        System.out.println(task4.result(arr));
    }
}
