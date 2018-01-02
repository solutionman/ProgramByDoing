import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int answer = 1 + random.nextInt(10);
        System.out.println("I have guessed a number between 1 and 10. Try to guess it.");
        int userInput = scanner.nextInt();
        while (userInput != answer){
            System.out.println("That is incorrect. Guess again");
            userInput = scanner.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
    }
}
