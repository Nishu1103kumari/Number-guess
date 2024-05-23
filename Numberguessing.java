package task;
import java.util.Scanner;
import java.util.Random;
public class Numberguessing {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int lowerBound = 1; // Lower bound of the range
	        int upperBound = 100; // Upper bound of the range
	        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        int maxAttempts = 5; // Maximum number of attempts allowed
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I've selected a number between " + lowerBound + " and " + upperBound + ".");
	        System.out.println("You have " + maxAttempts + " attempts to guess it.");

	        int attempts = 0;
	        boolean hasGuessedCorrectly = false;

	        while (attempts < maxAttempts && !hasGuessedCorrectly) {
	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
	                hasGuessedCorrectly = true;
	            } else if (guess < randomNumber) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Too high! Try again.");
	            }
	        }

	        if (!hasGuessedCorrectly) {
	            System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
	        }

	        scanner.close();
	    }
	

	}


