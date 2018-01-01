// Body Mass Index (BMI)
// It is computed by taking the individual's weight (mass) in kilograms
// and dividing it by the square of their height in meters.

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your height in m: ");
        double height = scanner.nextDouble();

        System.out.print("Your weight in kg: ");
        double weight = scanner.nextDouble();

        double result = weight / (height * height);
        String category = "unknown";

        if(result < 18.5){
            category = "underweight";
        }else if(result < 24.9){
            category = "normal wight";
        }else if(result < 29.9){
            category = "overweight";
        }else if(result > 30.0){
            category = "obese";
        }

        System.out.println("Your BMI is " + result);
        System.out.println("BMI category: " + category);
    }
}
