import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");

        int a = 0, b = 0, c = 0;
        while(a <= 0){
            System.out.print("Side 1: ");
            a = scanner.nextInt();
            if(a <= 0 ){
                System.out.printf("number %d should be more, than 0 , try again", a);
                System.out.println();
            }
        }
        while(b < a){
            System.out.print("Side 2: ");
            b = scanner.nextInt();
            if(b < a ){
                System.out.printf("number %d is less than %d , try again", b, a);
                System.out.println();
            }
        }
        while(c < b){
            System.out.print("Side 3: ");
            c = scanner.nextInt();
            if(c < b ){
                System.out.printf("number %d is less than %d , try again", c, b);
                System.out.println();
            }
        }

        System.out.printf("Your sides are: %d %d %d", a, b, c);
    }
}
