import java.util.Scanner;

public class  LogicalOperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check divisibility by 3 AND 5 using logical AND (&&) and modulo operator (%)
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 AND 5.");
        } else {
            System.out.println(num + " is NOT divisible by both 3 AND 5.");
        }

        sc.close();
    }
}
