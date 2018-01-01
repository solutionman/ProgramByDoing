import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int answer = 1 + randomNumber.nextInt(10);
        System.out.println("I'm thinking of a number from 1 to 10");
        System.out.print("Your guess: ");
        int userInput = scanner.nextInt();
        if(answer == userInput){
            System.out.println("That's right! My secret number was " + answer);
        } else {
            System.out.println("Sorry, but I was really thinking of " + answer);
        }
    }
}
