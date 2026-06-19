import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char playAgain;
        int totalScore = 0;

        System.out.println("===== Welcome to Number Guessing Game =====");

        do {
            int number = random.nextInt(100) + 1; // Random number 1–100
            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too High!");
                } 
                else if (guess < number) {
                    System.out.println("Too Low!");
                } 
                else {
                    System.out.println("Correct! You guessed the number.");
                    guessedCorrectly = true;
                    break;
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            // If user fails
            if (!guessedCorrectly) {
                System.out.println("Game Over! The correct number was: " + number);
            } 
            else {
                // Score calculation
                int score = (maxAttempts - attempts + 1) * 2;
                totalScore += score;

                System.out.println("Round Score: " + score);
            }

            System.out.println("Total Score: " + totalScore);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nThank you for playing!");
        sc.close();
    }
}