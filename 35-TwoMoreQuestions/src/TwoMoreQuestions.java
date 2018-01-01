import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println();
        System.out.println("Think of something and I'll try to guess it!");

        System.out.print("Question 1) Does it stay inside or outside or both? ");
        String firstAnswer = scanner.next();

        System.out.print("Question 2) Is it a living thing? (yes or no) ");
        String secondAnswer = scanner.next();

        if (firstAnswer.equals("inside") && secondAnswer.equals("yes")){
            System.out.println("Then what else could you be thinking of besides a houseplant?");
        } else if (firstAnswer.equals("inside") && secondAnswer.equals("no")){
            System.out.println("Then what else could you be thinking of besides a Shower curtain?");
        } else if (firstAnswer.equals("outside") && secondAnswer.equals("yes")){
            System.out.println("Then what else could you be thinking of besides a bison?");
        } else if (firstAnswer.equals("outside") && secondAnswer.equals("no")){
            System.out.println("Then what else could you be thinking of besides a billboard?");
        } else if (firstAnswer.equals("both") && secondAnswer.equals("yes")){
            System.out.println("Then what else could you be thinking of besides a dog?");
        } else if (firstAnswer.equals("both") && secondAnswer.equals("no")){
            System.out.println("Then what else could you be thinking of besides a cell phone?");
        } else {
            System.out.println("You must type right answer");
        }
    }
}
