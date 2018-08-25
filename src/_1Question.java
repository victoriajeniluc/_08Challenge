/**
 * Write a program to ask user to enter either Y or N.
 * User can enter in lower case or upper case.
 * If user enters Y or y, then display “Welcome!” and terminate the program.
 * If user enters N or n, then display “Good Bye!” and terminate the program.
 * If user enters any other character, then display “Please provide correct input.” and ask user to enter
 * either Y or N.
 * If user enters more than one character such as yes/no/abc, then display “Please provide only one
 * character.” and ask user to enter either Y or N.
 * Program should not be terminated until user provides Y/y/N/n.
 *
 * NOTE: Provide the solution under “challenge8” package and accept input as character.
 * Result of two separate executions:
 * Enter either Y/N: yes
 * Please provide only one character.
 * Enter either Y/N: a
 * Please provide correct input.
 * Enter either Y/N: y
 * Welcome!
 *
 * @author Udayan Khattry
 */


import java.util.Scanner;

public class _1Question {
    public static void main(String[] args) {
        //Create Scanner object linked to keyboard.
        Scanner scanner = new Scanner(System.in);

        //Infinite loop, boolean check to exit this loop is inside loop's body
        while(true) {
            System.out.println("Enter either Y/N:");
            String response = scanner.nextLine();

            if(response.length() != 1 ) {
                System.out.println("Please provide only one character");
                continue; //Continue with the next iteration of the loop.
            }

            //Extract character at 0th index from String object referred by str.
            char val = response.charAt(0);

            // if user input is Y/y then, display Welcome! and exit the loop.
            if(val == 'Y' || val == 'y') {
                System.out.println("Welcome");
                break;
            // If user input is N/n then, display Good Bye! and exit the loop.
            } else if(val == 'N' || val == 'n') {
                System.out.println("Goodbye");
                break;
            // If user input is other than Y/y/N/n, then display message and continue with the next iteration of the loop.
            } else {
                System.out.println("Please provide the correct input");
                continue;//Even if we don't provide continue, control will go to the next iteration, as it is the last statement in the loop.
            }
        }
        scanner.close(); //close the scanner
    }
}
