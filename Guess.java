import java.util.Scanner;
import java.util.Random;

class Guess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int secretNum = rand.nextInt(10) + 1;
        int guess = 0;
        int numGuesses = 0;

        while (guess != secretNum) {

            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            numGuesses++;

            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            }
            else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("You got it!!");
            }
        }
        System.out.println("It took you " + numGuesses + " guesses.");
    }
}