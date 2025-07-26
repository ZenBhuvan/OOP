public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Declare and initialize variables of all primitive data types
        byte byteVar = 100;
        short shortVar = 20000;
        int intVar = 500000;
        long longVar = 10000000000L;
        float floatVar = 5.75f;
        double doubleVar = 19.99;
        char charVar = 'A';
        boolean booleanVar = true;

        // Print their values
        System.out.println("Values of primitive data types:");
        System.out.println("byte    : " + byteVar);
        System.out.println("short   : " + shortVar);
        System.out.println("int     : " + intVar);
        System.out.println("long    : " + longVar);
        System.out.println("float   : " + floatVar);
        System.out.println("double  : " + doubleVar);
        System.out.println("char    : " + charVar);
        System.out.println("boolean : " + booleanVar);

        System.out.println("\nSizes of primitive data types (in bits):");
        System.out.println("byte    : " + Byte.BYTES * 8 + " bits");
        System.out.println("short   : " + Short.BYTES * 8 + " bits");
        System.out.println("int     : " + Integer.BYTES * 8 + " bits");
        System.out.println("long    : " + Long.BYTES * 8 + " bits");
        System.out.println("float   : " + Float.BYTES * 8 + " bits");
        System.out.println("double  : " + Double.BYTES * 8 + " bits");
        System.out.println("char    : " + Character.BYTES * 8 + " bits");

        // Note: boolean size is JVM dependent and there's no SIZE or BYTES constant for boolean.
        System.out.println("boolean : JVM dependent (typically 1 bit or 1 byte)");
    }
}
