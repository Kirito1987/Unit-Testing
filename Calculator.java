import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Your Calculator!");
        System.out.println("To start enter the first number:");

        double a = scanner.nextDouble();

        System.out.println("\nGreat! Your First number is " + a + "\n");
        System.out.println("Now enter the next number: ");

        double b = scanner.nextDouble();

        System.out.println("\nGreat, your next number is: " + b);
        System.out.println("\nPlease enter an operator (add, multiply, subtract, or divide):" + "\n");

        scanner.nextLine();
        String operator = scanner.nextLine();
        double result;

        switch (operator) {
            case "add":
                result = a + b;
                System.out.println("The answer to your equation is: " + result);
                break;
            default:
                System.out.println("Invalid operator. Please try again.");
    }

}
}
