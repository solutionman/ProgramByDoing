import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args){
        Random random = new Random();
        int number = 1 + random.nextInt(6);
        int x1 = 1 + random.nextInt(54);
        int x2 = 1 + random.nextInt(54);
        int x3 = 1 + random.nextInt(54);
        int x4 = 1 + random.nextInt(54);
        int x5 = 1 + random.nextInt(54);
        int x6 = 1 + random.nextInt(54);
        String answer = "";
        if(number == 1){
            answer = "You can do the most remarkable things, no matter what happens.";
        } else if (number == 2){
            answer = "Be positive.";
        } else if (number == 3){
            answer = "The future belongs to you.";
        } else if (number == 4){
            answer = "You became what you thinking about";
        } else if (number == 5){
            answer = "Believe in yourself.";
        } else if (number == 6){
            answer = "You, and only you responsible for your life.";
        }

        System.out.printf("Fortune cookie says: \"%s\"", answer);
        System.out.println();
        System.out.printf("    %d-%d-%d-%d-%d-%d ", x1, x2, x3, x4, x5, x6);
    }
}
