import java.util.Random;
import java.util.Scanner;

public class HiLoLimitedTries {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = 1 + random.nextInt(100);

        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("First guess: ");
        int userInput = scanner.nextInt();
        int counter = 1;

        while (userInput != answer && counter < 7){
            ++counter;
            if(userInput < answer){
                System.out.println("Sorry, you are too low.");
                System.out.printf("Guess #%d: ", counter);
                userInput = scanner.nextInt();
            } else if(userInput > answer){
                System.out.println("Sorry, you are too high.");
                System.out.printf("Guess #%d: ", counter);
                userInput = scanner.nextInt();
            }
        }

        if (userInput == answer){
            System.out.println("You guessed it! What are the odds!?");
        } else {
            System.out.println("Sorry, you didn't guess it in 7 times. You loose.");
        }
    }
}
