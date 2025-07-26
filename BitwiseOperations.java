import java.util.Scanner;

public class BitwiseOperations {
    // Helper method to get 32-bit binary string with leading zeros
    public static String to32BitBinaryString(int value) {
        return String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two integers
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // Perform bitwise operations
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        int leftShift = num1 << 1;      // Shift left by 1
        int rightShift = num1 >> 1;     // Signed shift right by 1
        int unsignedRightShift = num1 >>> 1; // Unsigned shift right by 1

        // Display results
        System.out.printf("\n%-20s %12s %35s\n", "Operation", "Decimal", "Binary (32-bit)");
        System.out.printf("%-20s %12d %35s\n", "First Number", num1, to32BitBinaryString(num1));
        System.out.printf("%-20s %12d %35s\n", "Second Number", num2, to32BitBinaryString(num2));
        System.out.printf("%-20s %12d %35s\n", "AND (&)", andResult, to32BitBinaryString(andResult));
        System.out.printf("%-20s %12d %35s\n", "OR (|)", orResult, to32BitBinaryString(orResult));
        System.out.printf("%-20s %12d %35s\n", "XOR (^)", xorResult, to32BitBinaryString(xorResult));
        System.out.printf("%-20s %12d %35s\n", "Left Shift (<<1)", leftShift, to32BitBinaryString(leftShift));
        System.out.printf("%-20s %12d %35s\n", "Right Shift (>>1)", rightShift, to32BitBinaryString(rightShift));
        System.out.printf("%-20s %12d %35s\n", "Unsigned Right Shift (>>>1)", unsignedRightShift, to32BitBinaryString(unsignedRightShift));

        sc.close();
    }
}
