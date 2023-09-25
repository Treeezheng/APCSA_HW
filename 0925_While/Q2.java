
// Write a method that plays the Hi-Lo guessing game with numbers. The program picks a random number between 1 and 100 (inclusive), then repeatedly prompts the user to guess the number. On each guess, report to the user that he or she is correct or that the guess is high or low. Continue accepting guesses until the user guesses correctly or chooses to quit. Use a sentinel value to determine whether the user wants to quit. Count the number of guesses and report that value when the user guesses correctly.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int gene;
        gene = (int) (Math.random() * 100 + 1);
        System.out.println("Guess the number form 0 - 100 right now!");
        while (true) {
            int i = num.nextInt();
            if (i > gene) {
                System.out.print("High");
            } else if (i < gene) {
                System.out.print("Low");
            } else {
                System.out.println("You are right! The number is " + gene + "!");
                break;
            }
        }

    }

}
