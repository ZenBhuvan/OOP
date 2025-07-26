import java.util.Scanner;

public class NarrowingTypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a double value from user
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        // Explicitly cast double to int (narrowing conversion)
        int intValue = (int) doubleValue;

        // Print both values
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int : " + intValue);

        sc.close();
    }
}
