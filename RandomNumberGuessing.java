import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100. Try to guess it.");
        
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        scanner.close();
    }
}