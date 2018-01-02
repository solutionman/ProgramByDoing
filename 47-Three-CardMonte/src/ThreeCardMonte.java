import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args){
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println();
        System.out.println("Which on is the ace?");
        System.out.println();
        System.out.println("      ## ## ##");
        System.out.println("      ## ## ##");
        System.out.println("      1  2  3");

        Random random = new Random();
        int card = 1 + random.nextInt(3);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        // check userInput
        if(userInput < 1 || userInput > 3 ){
            System.out.println("You should type 1 or 2 or 3");
            System.exit(0);
        }

        if (userInput == card){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        } else {
            System.out.printf("Ha! Fast Eddie wins again!. The ace was card number %d.", card);
            System.out.println();
        }
        if(card == 1){
            System.out.println("      AA ## ##");
            System.out.println("      AA ## ##");
            System.out.println("      1  2  3");
        } else if(card == 2){
            System.out.println("      ## AA ##");
            System.out.println("      ## AA ##");
            System.out.println("      1  2  3");
        } else {
            System.out.println("      ## ## AA");
            System.out.println("      ## ## AA");
            System.out.println("      1  2  3");
        }
    }
}
