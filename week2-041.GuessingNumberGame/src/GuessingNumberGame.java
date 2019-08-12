
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        int guess = -1;
        int guessCount = 0;
        
        while (guess != numberDrawn) {
            System.out.print("Guess a number: ");
            guess = reader.nextInt();
            
            guessCount++;
            if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: "+guessCount);
            } else if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+guessCount);
            }
            
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
