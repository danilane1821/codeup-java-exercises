import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(5,5));
        System.out.println(subtraction(15,3));
        System.out.println(division(20,5));
        System.out.println(multiplication(10,7));
        System.out.println(modulus(2,4));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);


    }


    public static double addition (double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction (double num1, double num2){
        return num1 - num2;
    }

    public static double division (double num1, double num2){
        return num1 / num2;
    }

    public static double multiplication (double num1, double num2){
        return num1 * num2;
    }

    public static double modulus (double num1, double num2){
        return num1 % num2;

    }

    // problem 2

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
//        System.out.println(input.hasNextInt());
        int numInput = input.nextInt();


        if(numInput >= min && numInput <= max){
            System.out.println("That number is between 1 and 10");
        }else if(numInput < min || numInput > max){
            System.out.println("Please enter a valid number");
            getInteger(min, max);
        }
        return min + max;

    }


}
