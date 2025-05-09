import java.util.Scanner;
import java.util.Random;

public class NumGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; 
        int guess = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (guess != randomNumber) {
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try again:");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number: " + randomNumber);
            }
        }

        scanner.close();
    }
}
