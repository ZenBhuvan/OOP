package WideningTypeConversion;

public class WideningTypeConversion {
    public static void main(String[] args) {
        int intValue = 123456;
        long longValue = intValue;      // int to long (widening)
        float floatValue = longValue;   // long to float (widening)

        System.out.println("Original int value   : " + intValue);
        System.out.println("After conversion to long  : " + longValue);
        System.out.println("After conversion to float : " + floatValue);

        // Checking equality
        if (intValue == longValue && longValue == (long)floatValue) {
            System.out.println("No data is lost in widening conversion!");
        } else {
            System.out.println("Data might be lost.");
        }
    }
}
