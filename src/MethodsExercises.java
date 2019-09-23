import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(5, 5));
        System.out.println(subtraction(15, 3));
        System.out.println(division(20, 5));
        System.out.println(multiplication(10, 7));
        System.out.println(modulus(2, 4));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println(factorial());
        rollDice();

    }


    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;

    }

// problem 2

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int numInput = input.nextInt();
            if (numInput >= min && numInput <= max) {
                System.out.println(numInput + " is between 1 & 10!");
                return numInput;
            } else if (numInput < min || numInput > max) {
                System.out.println("This number is not valid, enter another number: ");
                return getInteger(min, max);
            }
        } else {
            System.out.println("not a valid input! Enter a valid number: ");

        }
        return 0;
    }


//problem 3

    public static int factorial() {
        int number = getInteger(1, 10);

        int startValue = 1;
        String middleString = "";
        for (int i = 1; i <=number; i++) {
            startValue *= i;
            if(middleString.isEmpty()){
                middleString += i;
            }else {
                middleString += " X " + i;
            }
            System.out.println(i + "! = " + middleString + " = " + startValue);
        }
        return 0;
    }



//problem 4


    public static void rollDice () {
        Scanner diceSide = new Scanner(System.in);
        System.out.println("How many dice sides would you like?");
        int dice = Integer.parseInt(diceSide.nextLine());
        int diceRoll1 = (int) (dice*Math.random()+1);
        int diceRoll2 = (int) (dice*Math.random()+1);
        System.out.println("You rolled " + diceRoll1 + " and then " + diceRoll2);
        System.out.println("Would you like to roll again? Y/N");
        String response = diceSide.nextLine();
        if(response.equalsIgnoreCase("y")){
            rollDice();
        }

    }

}