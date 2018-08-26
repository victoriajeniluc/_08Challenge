/**
 *
 * Write a program to accept an int value from the user until user provides 0.
 * Display the same value in the output.
 * For non-zero values, re-run the logic.
 * NOTE: Use of while loop is must in the logic.
 * One of the results of the execution:
 * Enter 0 to exit: 100
 * You entered: 100
 * Enter 0 to exit: -1
 * You entered: -1
 * Enter 0 to exit: 5
 * You entered: 5
 * Enter 0 to exit: 0
 * You entered: 0
 */

import java.util.Scanner;
public class _4Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object linked to the keyboard

        while(true) { // infinite loop, boolean expression is always true
            System.out.print("Enter 0 to exit: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);

            if(number == 0) {
                break;//Check for the user's input value
            }
        }
        scanner.close(); // close for the user's input value
    }
}
