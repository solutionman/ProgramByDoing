import java.util.Scanner;

public class AgeMessages {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("You name is " + name);
        System.out.println("You age is " + age);

        if (age < 16){
            System.out.println("You can't drive");
        } else if (age < 17){
            System.out.println("You can drive but not vote.");
        } else if(age < 24){
            System.out.println("You can vote but not rent a car");
        } else if (age > 25){
            System.out.println("You can do pretty much anything");
        }
    }
}
