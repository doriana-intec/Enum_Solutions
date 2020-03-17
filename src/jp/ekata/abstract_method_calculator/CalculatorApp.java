package jp.ekata.abstract_method_calculator;

public class CalculatorApp {
    public static void main(String[] args) {

        double x = 5;
        double y = 2;

        for (Operation operation : Operation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f%n", x, operation, y, operation.apply(x, y));
        }
    }
}
