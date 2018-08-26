/**
 * Question 5:
 * Write a program to accept an int value from the user until user provides 0.
 * Display the same value in the output.
 * For non-zero values, re-run the logic.
 *
 * NOTE: Use of do-while loop is must in the logic.
 *
 * @author Udayan Khattry
 */

import java.util.Scanner;

public class _5Question {
    public static void main(String[] args) {
        //Create Scanner object linked to keyboard.
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter 0 to exit: ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } while(number != 0);//Boolean expression checks input value from the user.

        scanner.close();//Close the scanner
    }
}
