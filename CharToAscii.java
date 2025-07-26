import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a character from the user
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Get ASCII value (char is implicitly convertible to int)
        int asciiValue = (int) ch;

        // Display outputs
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
        System.out.println("ASCII value as integer: " + asciiValue);

        sc.close();
    }
}
