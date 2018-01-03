import java.util.Random;
import java.util.Scanner;

public class CountingWithAWhileLoop {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type in message: ");
        String message = keyboard.nextLine();
        System.out.print("How many times display it? ");
        int amount = keyboard.nextInt();

        int n = 1;
        while(n <= amount){
            System.out.println((n * 10) + ". " + message);
            n++;
        }
    }
}
