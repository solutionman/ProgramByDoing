import java.util.Random;

public class Dice {
    public static void main(String[] args){
        System.out.println("HERE COMES THE DICE!");
        Random random = new Random();
        int firstDice = 1 + random.nextInt(6);
        int secondDice = 1 + random.nextInt(6);
        System.out.println("Roll #1: " + firstDice);
        System.out.println("Roll #2: " + secondDice);
        int total = firstDice + secondDice;
        System.out.printf("The total is %d!", total);
    }
}
