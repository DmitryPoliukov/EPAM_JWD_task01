package by.epamtc.poliukov.tasks01.task8;

public class Runner {
    public static void main(String[] args) {
        CalculatorFunctionValue calculatorFunctionValue = new CalculatorFunctionValue();

        double function = calculatorFunctionValue.calculation(calculatorFunctionValue.readArgument());
        System.out.printf("The function value is %.3f", function);
    }
}
