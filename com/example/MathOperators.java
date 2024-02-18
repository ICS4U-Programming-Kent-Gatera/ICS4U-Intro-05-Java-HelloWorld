import java.util.Scanner;

/**
 *
 * My program Does math operations.
 *
 * @author  Kent Gatera
 * @version 1.0
 * @since   2024-Feb-18
 */

/**
* The main class.
*
*/
public class MathOperators {

    /**
    * Pleases the style checker.
    *
    * @param args unused.
    */
    public static void main(String[] args) {

        // Initializing Variables
        final int userNum1;
        final int userNum2;
        final Scanner userInput = new Scanner(System.in);
        // Getting input
        System.out.print("What is your first number?: ");
        userNum1 = userInput.nextInt();
        System.out.print("What is your second number?: ");
        userNum2 = userInput.nextInt();
        // Addition
        System.out.println(
                "The sum of " + userNum1 + " and " + userNum2
                +" is " + (userNum1 + userNum2));
        // Subtract
        System.out.println(
                "The difference of " + userNum1 + " and "
            + userNum2 + " is " + (userNum1 - userNum2));
        // Multiply
        System.out.println(
                "The product of " + userNum1 + " and "
            + userNum2 + " is " + (userNum1 * userNum2));
        // Divide
        // Casting userNum1 and 2 into doubles
        final double quotient = (double) userNum1 / (double) userNum2;
        System.out.printf(
                "The quotient of " + userNum1 + " and " + userNum2
             + " is " + "%.2f%n", quotient);
        // Power
        System.out.println(
                "The power of " + userNum1 + " to " + userNum2
            + " is " + Math.pow(userNum1, userNum2));
    }

    /**
    * Pleases the style checker.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */

    private static void mathOperators() {
        throw new IllegalStateException("Utility class");
    }
}
