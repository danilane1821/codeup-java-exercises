import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(5, 5));
        System.out.println(subtraction(15, 3));
        System.out.println(division(20, 5));
        System.out.println(multiplication(10, 7));
        System.out.println(modulus(2, 4));

        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
        System.out.println(factorial());
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
//        getInteger(1,10); if you leave it here it continues to run
        } else {
            System.out.println("not a valid input! Enter a valid number: ");

        }
        return getInteger(min, max);
    }


//problem 3

    public static int factorial() {
        int number = getInteger(1, 10);

//        int n=5,fact=1;
//
//        for(int i=1;i<=n;i++)
//        {
//
//            fact=fact*i;
//        }
//
//        System.out.println("factoral="+fact);
//        return 0;


        int startValue = 1;
        String middleString = "";
        for (int i = 1; i <=number; i++) {
            startValue *= i;
            System.out.println(middleString);
            if(middleString.isEmpty()){
                middleString += i;
            }else {
                middleString += " X " + i;
            }
            System.out.println(middleString);
        }

        return 0;
    }

}