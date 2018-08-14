import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args){
        System.out.println("SQUARE ROOT!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try{
            double userInput = scanner.nextDouble();
            if(userInput < 0){
                System.out.println("You can't take the square root of a negative number, silly");
                return;
            }
            try{
                double result = Math.sqrt(userInput);
                System.out.printf("The square root of %f is %f ",userInput, result);
            } catch(Exception e){
                System.out.println("Can't get square root of " + userInput);
            }
        } catch(Exception e){
            System.out.println("Can't read this as a number");
        }

    }
}
