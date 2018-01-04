import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithCounter {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = 1 + random.nextInt(10);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int userInput = scanner.nextInt();
        int counter = 1;
        while(userInput != number){
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            userInput = scanner.nextInt();
            ++counter;
        }
        System.out.println("That's right! You're a good guesser.");
        System.out.printf("It only took you %d times", counter);
    }
}
