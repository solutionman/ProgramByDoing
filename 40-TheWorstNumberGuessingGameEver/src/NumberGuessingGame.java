import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("TEH WORST NUMBER GESSING GAME EVAR!!!");
        System.out.println("I'M THKING OF A NER FROM 1-10. TRY 2 GESS!");
        int userInput = scanner.nextInt();
        Random rand = new Random();
        int answer = rand.nextInt(10) + 1;

        if(userInput == answer){
            System.out.println("LOL!!! U GOT IT! I CANT BELIEVE U GESSED IT WAS " + answer);
        } else {
            System.out.println("WOOT! U SUXOR!!! I PWN JOO!!! IT WAS " + answer);
        }
    }
}
