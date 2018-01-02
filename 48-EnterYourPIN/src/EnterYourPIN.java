import java.util.Scanner;

public class EnterYourPIN {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF FREEDOM");
        System.out.print("ENTER YOUR PIN ");
        int entry = keyboard.nextInt();

        while(entry != pin){
            //System.out.println();
            System.out.println("\nINCORRECT PIN. TRY AGAIN");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}
