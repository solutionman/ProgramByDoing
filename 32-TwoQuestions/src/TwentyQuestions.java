import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it");

        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        String firstAnswer = reader.next();
        String secondAnswer;
        if(firstAnswer.equals("animal")){
            System.out.println("Question 2) Is it bigger than a breadbox?");
            secondAnswer = reader.next();
            if(secondAnswer.equals("no")){
                System.out.println("My guess is that you are thinking of a mouse");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else if (secondAnswer.equals("yes")){
                System.out.println("My guess is that you are thinking of a squirrel.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else {
                System.out.println("You should type yes or no");
                System.exit(0);
            }
        } else if (firstAnswer.equals("vegetable")){
            System.out.println("Question 2) Is it bigger than a breadbox?");
            secondAnswer = reader.next();
            if(secondAnswer.equals("no")){
                System.out.println("My guess is that you are thinking of a carrot");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else if (secondAnswer.equals("yes")){
                System.out.println("My guess is that you are thinking of a watermelon.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else {
                System.out.println("You should type yes or no");
                System.exit(0);
            }
        } else if (firstAnswer.equals("mineral")){
            System.out.println("Question 2) Is it bigger than a breadbox?");
            secondAnswer = reader.next();
            if(secondAnswer.equals("no")){
                System.out.println("My guess is that you are thinking of a paper clip");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else if (secondAnswer.equals("yes")){
                System.out.println("My guess is that you are thinking of a Camaro.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else {
                System.out.println("You should type yes or no");
                System.exit(0);
            }
        } else{
            System.out.println("You should type \"animal\" or \"vegetable\" or \"mineral\"");
            System.exit(0);
        }

    }
}
