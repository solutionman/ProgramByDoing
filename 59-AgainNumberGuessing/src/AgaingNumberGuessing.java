import java.util.Random;
import java.util.Scanner;

public class AgaingNumberGuessing {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = 1 + random.nextInt(10);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        int userInput;
        int counter = 0;
        do {
            if(counter > 0){
                System.out.println("That is incorrect. Guess again");
            }
            System.out.print("Your guess: ");
            userInput = scanner.nextInt();
            ++counter;
        } while (userInput != answer);

        System.out.println("That's right! You're a good guesser.");
        System.out.printf("It only took your %d tries.", counter);
    }
}
