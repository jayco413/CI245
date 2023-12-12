/**
 * The PrintFDemo class demonstrates the usage of the printf method in Java.
 * This class includes various examples of how to format strings, numbers,
 * and other data types using printf. It showcases different format specifiers,
 * width, alignment, and number formatting options.
 */
public class PrintFDemo {
	
    /**
     * Main method demonstrating various ways to use printf for formatting.
     * It includes examples with different data types such as integers, floating-point numbers,
     * and demonstrates various format specifiers and formatting options like width,
     * alignment, precision, and number grouping.
     *
     * @param args command line arguments (not used in this demo)
     */
    public static void main(String[] args) {
        /**
         * Format Specifiers:
         * 
         * %c - character
         * %d - decimal (integer) number (base 10)
         * %e - exponential floating-point number
         * %f - floating-point number
         * %i - integer (base 10)
         * %o - octal number (base 8)
         * %s - String
         * %u - unsigned decimal (integer) number
         * %x - number in hexadecimal (base 16)
         * %t - formats date/time
         * %% - print a percent sign
         * \% - print a percent sign
         * %n - prints a new line
         * 
         * Escape Characters:
         * 
         * \b - backspace
         * \f - formfeed
         * \n - newline
         * \r - carriage return
         * \t - tab
         * \\ - backslash
         */
    	
        // Demonstrating basic usage of printf with format specifiers
        int x = 10;
        // Formats the integer 'x' and its negative value, and then moves to a new line
        System.out.printf("Formatted output is: %d %d%n", x, -x);

        // Demonstrating printf with floating-point numbers and dynamic precision
        double y = Math.PI;
        int z = 2;
        // Printing the original value of 'y'
        System.out.println("y: " + y); // y: 3.141592653589793
        // Dynamically setting precision of 'y' to 'z' decimal places
        System.out.printf("Formatted y: %." + z + "f\n", y); // Formatted y: 3.14
        // Setting precision of 'y' to 4 decimal places
        System.out.printf("Formatted y: %.4f\n", y); // Formatted y: 3.1416

        // Demonstrating width and alignment in printf
        // Allocates a width of 5 characters, formats to two decimal places
        System.out.printf("xx %5.2fxx%n", y); // Output: xx  3.14xx

        // Demonstrating filling with zeros
        // Formats numbers with leading zeros to fit the specified width
        System.out.printf("'%05.2f'%n", 2.28);
        System.out.printf("'%010.2f'%n", 2.28);
        System.out.printf("'%010.2f'%n", -2.28);
        System.out.printf("'%010.2f'%n", 1234567.89);
        System.out.printf("'%010.2f'%n", -1234567.89);

        // Demonstrating left and right alignment
        // Formats number aligned to the right (default)
        System.out.printf("'%10.2f'%n", 2.28);
        // Formats number aligned to the left (using '-')
        System.out.printf("'%-10.2f'%n", 2.28);

        // Demonstrating grouping digits with commas
        // Formats a number with grouping commas, right-aligned in a field of 10
        System.out.printf("$%,10.2f %n", 5000.00); 
    }
}

