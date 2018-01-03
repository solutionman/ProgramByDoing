import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args){
        Random random = new Random();
        int firstDice;
        int secondDice;
        int total;
        do {
            firstDice = 1 + random.nextInt(6);
            secondDice = 1 + random.nextInt(6);
            System.out.println("Roll #1: " + firstDice);
            System.out.println("Roll #2: " + secondDice);
            total = firstDice + secondDice;
            System.out.printf("The total is %d!", total);
            System.out.println();
            System.out.println("--------------");
        } while (firstDice != secondDice);
    }
}
