import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;
        double modulus;

        // Check for division/modulus by zero
        if (num2 != 0) {
            quotient = num1 / num2;
            modulus = num1 % num2;
        } else {
            quotient = Double.NaN; // Not a Number to indicate undefined
            modulus = Double.NaN;
        }

        // Print results
        System.out.println("\nResults of arithmetic operations:");
        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, sum);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, difference);
        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, product);
        if (num2 != 0) {
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, quotient);
            System.out.printf("%.2f %% %.2f = %.2f%n", num1, num2, modulus);
        } else {
            System.out.println("Division by zero is undefined.");
            System.out.println("Modulus by zero is undefined.");
        }

        sc.close();
    }
}
