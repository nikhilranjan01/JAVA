import java.util.Scanner;

class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the add method from the Calculator class
        int sum = calculator.add(num1, num2);

        // Print the result
        System.out.println("Sir Your Output23: " + sum);

        // Close the scanner
        scanner.close();
    }
}
