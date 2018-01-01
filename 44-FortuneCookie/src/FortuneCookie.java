import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args){
        Random random = new Random();
        int number = 1 + random.nextInt(6);
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
    }
}
