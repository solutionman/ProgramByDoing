import java.util.Scanner;

public class CollatzSequence
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for Collatz Sequence: ");
        int userInput = scanner.nextInt();
        System.out.print(userInput + " ");
        int counter = 0;
        int largestValue = 0;
        do
        {
            if(userInput % 2 == 0)
            {
                userInput = userInput / 2;
            }
            else if ( userInput % 2 != 0 )
            {
                userInput = userInput * 3 + 1;
            }
            ++counter;
            System.out.print(userInput + " ");
            if (largestValue < userInput)
            {
                largestValue = userInput;
            }
        }while(userInput != 1);
        System.out.println();
        System.out.printf("Terminated in %d steps.", counter);
        System.out.println();
        System.out.println("The largest value was " + largestValue);
    }
}
