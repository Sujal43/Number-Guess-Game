import java.util.Scanner;

public class numbergame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1; // Generates a random number between 1-100
        int userGuess = 0; // Stores the user's guess
        int attempts = 0; // Counts the number of attempts

        System.out.println("Let's Enjoy the Number Guessing Game by Sujal Kumar Saw!");
        System.out.println("Hey guys, I picked a number between 1-100. Can you guess it?");

        // Game loop
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            try {
                userGuess = sc.nextInt(); // Update the guess
                attempts++; // Increment attempts

                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer between 1 and 100.");
                sc.next(); // Clear the invalid input
            }
        }

        // Success message
        System.out.println("Congratulations! You guessed the right number in " + attempts + " attempts.");

        // Close the scanner
        sc.close();

        System.out.println("Thanks for playing this Number Guessing Game!");
        System.out.println("- Sujal Kumar Saw");
    }
}
