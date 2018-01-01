import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your gender (M or F): ");
        String gender = scanner.next();
        System.out.print("First name: ");
        String firstName = scanner.next();
        System.out.print("Last name: ");
        String lastName = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        String title = "";
        if(age > 20 && gender.equals("F")){
            System.out.printf("Are you married, %s (y or n)? ", firstName);
            String marriage = scanner.next();
            if(marriage.equals("y")){
                title = "Mrs.";
            } else if(marriage.equals("n")){
                title = "Ms.";
            } else {
                System.out.println("You should type y or n");
                System.exit(0);
            }
            System.out.printf("Then I shall call you %s %s", title, lastName);
        } else if(age > 20 && gender.equals("M")){
            title = "Mr.";
            System.out.printf("Then I shall call you %s %s", title, lastName);
        } else if(age < 20){
            System.out.printf("Then I shall call you %s %s", firstName, lastName);
        } else {
            System.out.println("You typed incorrect data");
        }
    }
}
