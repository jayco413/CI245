import java.util.Scanner;

/**
 * The ASCIIValue class demonstrates the conversion of a character to its ASCII
 * value. It reads a string from the user, extracts the first character, and
 * prints its ASCII value.
 * 
 * @author Jason A. Covey
 */
public class ASCIIValue {

    /**
     * The main method starts the program execution.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Demonstrating the concept of casting with character '3'
        // and its equivalent integer value in ASCII.
        int j = (int) '3';

        // Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a string. Note that input.next()
        // will only read input up to the first space.
        System.out.println("Enter a string:");
        String s = input.next();

        // Check if the string is not empty
        if (s.length() > 0) {
            // Extracting the first character of the string using charAt.
            // The charAt method returns the character at the specified index.
            char c = s.charAt(0);

            // Casting the character to its ASCII integer equivalent.
            int ascii = (int) c;

            // Printing the ASCII value of the character.
            System.out.println("ASCII value: " + ascii);
        }

        // Closing the scanner object to prevent resource leak.
        input.close();
    } 
}
