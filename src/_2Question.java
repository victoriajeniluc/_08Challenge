/**
 * Same as Question 1 but accept user input as String. You may have to user some methods of String
 * class.
 * Result of two separate executions:
 * Enter either Y/N: YES
 * Please provide only one character.
 * Enter either Y/N: P
 * Please provide correct input.
 * Enter either Y/N: Y
 * Welcome!
 * Enter either Y/N: NO
 * Please provide only one character.
 * Enter either Y/N: N
 * Good Bye
 *
 * NOTE: Provide the solution under “challenge8” package and accept user input as String.
 *  * You may have to user some methods of String class.
 *
 * @author Udayan Khattry
 */

import java.util.Scanner;

public class _2Question {
    public static void main(String[] args) {
        // Create an object of the Scanner class to collect user input
        Scanner scanner = new Scanner(System.in);

        //Infinite loop, we will exit the loop only when user's input is Y / y / N / n
        while(true) {
            System.out.print("Enter either Y/N: ");
            String str = scanner.nextLine(); //Accept input as String.

            if(str.length() != 1) {
                System.out.println("Please only provide one character!");
                continue;//Continue with the next iteration of the loop.
            }

            //If user input is Y/y then, display Welcome! and exit the loop.
            if (str.equalsIgnoreCase("y")) {
                System.out.println("Welcome");
                break;
                //If user input is N/n then, display Good Bye! and exit the loop.
            } else if (str.equalsIgnoreCase("n"))  {
                System.out.println("Goodbye");
                break;
            } else {//If user input is other than Y/y/N/n, then display message and continue with the next iteration of the loop.
                System.out.println("Please provide the right input");
                continue;//Even if we don't provide continue, control will go to the next iteration, as it is the last statement in the loop.
            }
        }
        scanner.close();//close the scanner
    }
}
