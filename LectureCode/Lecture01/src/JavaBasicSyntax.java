import java.util.Scanner;

/**
 * This class demonstrates all of the basic elements of today's lesson.
 * 
 * A class, for now, is the encapsulation of code in a logical segment.
 * 
 * @author Jason A. Covey
 */
public class JavaBasicSyntax {

	/**
	 * The main method takes in one argument called "args".  Args are supplied
	 * via the command line.
	 * 
	 * You can also set args by going to Run -> Run Configurations -> Arguments
	 * in Eclipse.
	 * 
	 * This method is what Java looks for to run first.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 0; // initialize x to zero, this is a single line comment
		
		System.out.print("Enter a non-zero value for x: "); // This prints to output
												   			// but does not carriage
															// return

		// We have to initialize the scanner to get input from the keyboard.
		// The keyboard is "System.in".
		Scanner in = new Scanner(System.in);

		
		// Loop, at least once, to get input from the user
		do {
			x = in.nextInt();
		} while (x == 0);
		
		System.out.println("Thank you!"); // This prints to out with a carriage return
		
		// Let's test and see if the number is divisible by 5.  If it isn't we'll make
		// it so.
		if (x % 5 == 0) {
			
			System.out.println("This number is divisible by 5");
			
		} else {
			
			// Let's find the next highest value of x which is divisible by 5
			while (x % 5 != 0) {
				x++;
			}
			
		}
		
		// Format x when you print it out such that its a decimal integer
		// \n represents the newline character, it makes a carriage return
		System.out.printf("Next multiple of 5 is %d\n", x);
		
		// Let's count to x from 0!
		for (int i = 0; i <= x; i++) {
			// We can also print things out using +
			System.out.println("Count: " + i);
		}
	}

}
