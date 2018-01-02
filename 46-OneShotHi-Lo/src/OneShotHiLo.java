import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
    public static void main(String[] args){
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        Random random = new Random();
        int answer = 1 + random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if(userInput == answer){
            System.out.println("You guessed it! What are the odds?!");
        } else  if (userInput > answer){
            System.out.println("Sorry, you are too high. I was thinking of " + answer);
        } else if (userInput < answer){
            System.out.println("Sorry, you are too low. I was thinking of " + answer);
        }
    }
}
