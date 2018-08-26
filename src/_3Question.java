/* HOW I DID THE PROBLEM
*
 * Write a program that simulates rolling a pair of dice. Roll of 1st die will give a number between 1 and
 * 6. Roll of 2nd die will also give a number between 1 and 6. You can use java.security.SecureRandom
 * class to get the numbers for both the dice. Their sum can be number between 2 and 12.
 *
 * At the start ask the user to guess a number between 2 and 12. Then roll both the dice and if their
 * sum matches with the guessed number then we have a winner. Display greetings and exit the
 * program.
 * But if their sum doesn’t match, then ask user, if he would like to play again. If his answer is n, then
 * exit the program but if his answer is y then re-run the same logic.
 * Your output should match with below output.
 * Result of three separate executions:
 * Guess a number between 2 and 12: 7
 * To win you have to score 7
 * Press Enter to roll the dice...
 * Your score: 9. Sorry you lost, would you like to play again? (y/n): y
 * Guess a number between 2 and 12: 7
 * To win you have to score 7
 * Press Enter to roll the dice...
 * Congratulations!!!! Collect prize money at the counter.
 * Guess a number between 2 and 12: 10
 * To win you have to score 10
 * Press Enter to roll the dice...
 * Your score: 5. Sorry you lost, would you like to play again? (y/n): n
 * Guess a number between 2 and 12: 100
 * Guess a number between 2 and 12: 45
 * Guess a number between 2 and 12: 10
 * To win you have to score 10
 * Press Enter to roll the dice...
 * Your score: 6. Sorry you lost, would you like to play again? (y/n): y
 * Guess a number between 2 and 12: 10
 * To win you have to score 10
 * Press Enter to roll the dice...
 * Your score: 5. Sorry you lost, would you like to play again? (y/n): n

import java.security.SecureRandom;
import java.util.Scanner;


public class _3Question {
    public static void main(String[] args) {
        // Create an object of the Scanner class to grab the user's input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to guess a number between 2 to 12
        System.out.print("Guess a number between 2 and 12: ");

        // Create a variable to store the user's answer
        String responseInString = scanner.nextLine();
        int guess  = Integer.parseInt(responseInString);

        while(true) {
            if (guess <= 2 || guess >= 12) {
                System.out.println("Uh I said BETWEEN... one more time");
                continue;
            } else {
                // Let the user know that they need to win by guessing the right sum of the two dices
                System.out.println("To win you have to score " + guess);

                // Tell the user to press Enter to start the roll
                System.out.println("Press enter to roll the die....");
                String enter = scanner.nextLine();

                if (enter != null) {
                    //create an infinite loop of being able to roll the dice

                    while (true) {
                        SecureRandom random = new SecureRandom();
                        int result = 0;

                        for (int i = 0; i < 100; i++) {
                            int dice1 = random.nextInt(6) + 1; // This generates a random number between 1 - 6

                            // To generate number between 1 and 10, add 1 to the generated number
                            int dice2 = random.nextInt(6) + 1; // this results in number between 1 and 6
                            result = dice1 + dice2;
                        }


                        if (result == guess) {
                            System.out.println("CONGRATS! Collect prize money at the counter!");
                            break;
                        } else {
                            System.out.println("Your score: " + result + ". Sorry you lost, would you like to play again?");
                            String answer = scanner.nextLine();
                            char val = answer.charAt(0);

                            if (val == 'Y' || val == 'y') {
                                System.out.println("Here we go again!");
                                continue;
                            } else if (val == 'N' || val == 'n') {
                                System.out.println("Thanks for playing! Goodbye now!");
                                break;
                            } else {
                                System.out.println("Sorry you didn't enter the correct input!");
                                continue;
                            }
                        }
                    }
                    break;
                } else {
                    System.out.println("Please try again");
                }
            }
            scanner.close();
        }
    }
}
*/


/**
 * Question 3:
 * Write a program that simulates rolling a pair of dice.
 * Roll of 1st die will give a number between 1 and 6.
 * Roll of 2nd die will also give a number between 1 and 6. You can use java.security.SecureRandom class
 * to get the numbers for both the dice. Their sum can be number between 2 and 12.
 *
 * At the start ask the user to guess a number between 2 and 12. Then roll both the dice and if their
 * sum matches with the guessed number then we have a winner. Display greetings and exit the program.
 *
 * But if their sum doesn’t match, then ask user, if he would like to play again.
 * If his answer is n, then exit the program but if his answer is y then re-run the same logic.
 *
 * @author Udayan Khattry
 */



import java.security.SecureRandom;
import java.util.Scanner;

public class _3Question {
    public static void main(String[] args) {
        //Create Scanner object linked to keyboard.
        Scanner scanner = new Scanner(System.in);

        SecureRandom rn = new SecureRandom(); //Will be used in simulating rolling a pair of dice

        //Infinite loop, it ends if user wins OR based on user input.
        while(true) {
            System.out.print("Guess a number between 2 and 12: ");
            int num = scanner.nextInt();
            if(num < 2 || num > 12) { //If guessed number is not between 2 and 12, then ask him to guess again.
                continue;
            }
            scanner.nextLine();//Consume the newline character left by nextInt() method as I have to use nextLine() later.
            System.out.println("To win you have to score " + num);
            System.out.print("Press Enter to roll the dice...");
            scanner.nextLine(); //No need to process the captured String

            int dice1 = rn.nextInt(6) + 1; //This simulates rolling 1st dice and will result in any number between 1 and 6.
            int dice2 = rn.nextInt(6) + 1; //This simulates rolling 2nd dice and will result in any number between 1 and 6.
            int sum = dice1 + dice2;
            if(sum == num) { //If sum of both the dice matches with the guessed number, show greetings and break the loop.
                System.out.println("Congratulations!!!! Collect prize money at the counter.");
                break;
            } else { //If sum of both the dice doesn't match with the guessed number, then ask user if he wants to play again.
                System.out.print("Your score: " + sum + ". Sorry you lost, would you like to play again? (y/n): ");
                String str = scanner.nextLine();
                //YOU CAN HAVE MORE CHECKS OVER HERE FOR USER INPUT.
                if(str.equalsIgnoreCase("y")) { //If user provides Y/y then continue
                    continue;
                } else { //If user provides anything other than Y/y then exit the loop.
                    break;
                }
            }
        }
        scanner.close(); //close the scanner.
    }
}