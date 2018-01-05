import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");
        System.out.println("To stop counting type 0");
        System.out.print("Number: ");
        int userInput = scanner.nextInt();
        int total = 0;
        while (userInput != 0){
            total = total + userInput;
            System.out.println("The total so far is " + total);
            System.out.print("Number: ");
            userInput = scanner.nextInt();
        }
        System.out.println("The total is " + total);
    }
}
