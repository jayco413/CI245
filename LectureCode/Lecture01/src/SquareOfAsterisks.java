import java.util.Scanner;

/**
 * This class represents a square of asterisks. It demonstrates the concept
 * of top-down design by breaking down the problem into simpler, smaller
 * tasks. The square is composed of a top and bottom row, and a middle section.
 * The top and bottom are identical, while the middle section consists of
 * rows with asterisks at the beginning and end, and spaces in between.
 */
public class SquareOfAsterisks {

    /**
     * The main method starts the program and handles the drawing of the square.
     * It asks the user for the size of the square and prints it to the console.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = input.nextInt();

        // Validate the size input
        if (size < 1 || size > 20) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        // Handle the edge case of a single asterisk
        if (size == 1) {
            System.out.println("*");
            System.exit(0);
        }

        // Calculate the number of spaces in the middle rows
        int middleSpaces = size - 2;

        // Draw the top row
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Draw the middle section
        for (int i = 0; i < middleSpaces; i++) {
            System.out.print("*");
            for (int j = 0; j < middleSpaces; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Draw the bottom row
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
