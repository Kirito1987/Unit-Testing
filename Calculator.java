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

        double num1 = scanner.nextDouble();

        System.out.println("\nGreat! Your First number is " + num1 + "\n");
        System.out.println("Now enter the next number: ");

        double num2 = scanner.nextDouble();

        System.out.println("\nGreat, your next number is: " + num2);
    }
}
