import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            playAgain = false;
            int attempts = 0;
            int maxAttempts = 10;
            int targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Game!");
            System.out.println("Guess the number between 1 and 100.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + " of " + maxAttempts + "): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all your attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("yes")) {
                playAgain = true;
            }

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
