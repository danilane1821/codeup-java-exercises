public class MethodsExercises {
//
//    import javax.annotation.processing.SupportedSourceVersion;
//import java.util.Scanner;
//    public class MethodsExercises {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//        System.out.println(addition(5, 3));
//        System.out.println(subtraction(10, 5));
//        System.out.println(multply(5, 4));
//        System.out.println(div(10, 2));
//        System.out.println(modulus(2,3));
//        System.out.println(multiplyNoOp(10,10));
//        System.out.println(getInt(0,10));
//        System.out.println(factorial());
//        rollDice();
//        higLow();
//        guessTheNumber();
        }
//    1. Basic Arithmetic
//    public static int addition(int sum1, int sum2){
//        return sum1 + sum2;
//    }
//    public static int subtraction(int sum3, int sum4){
//        return sum3 - sum4;
//    }
//    public static int multply(int sum5, int sum6){
//        return sum5 * sum6;
//    }
//    public static int div(int sum7, int sum8){
//        return sum7 / sum8;
//    }
//    public static int modulus(int sum9, int sum10){
//        return sum9 % sum10;
//    }
//    public static int multiplyNoOp(int x, int y){
//        if(y == 0){
//            return 0;
//        }
//        return (x + multiplyNoOp(x, y - 1));
//    }
//    hasNextInt
//public static int getInt(int min, int max) {
//        Scanner sc = new Scanner(System.in);
////        values are set in the called method in the main class
//        System.out.println("Please enter a number between " + min + " and " + max);
////        CHecks to see if it is a integer
//        if (sc.hasNextInt()) {
////            makes the scanner class a int variable
//            int userNum = sc.nextInt();
////            nested if else if it is a intger
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Number out of range!");
//                return getInt(min, max);
//            }
//        } else {
//            System.out.println("Invalid input!");
//            getInt(min, max);
//        }
//        return 0;
//    }
//    public static long factorial(){
//       Scanner input = new Scanner(System.in);
//            System.out.println("enter a number between 1-10");
//            int number = input.nextInt();
//            int startValue = 1;
//            String middleString = "";
//
//            for (int i = 1; i <= number; i++) {
//                startValue *= i;
//                if (middleString.isEmpty()) {
//                    middleString += i;
//                } else {
//                    middleString += " X " + i;
//                }
//                System.out.println(i + "! = " + middleString + " = " + startValue);
//            }
//        System.out.println("Would you like to continue? {y/n}");
//            String yesNO = input.nextLine();
//            if(yesNO.equalsIgnoreCase("y")){
//                factorial()
//            }
//            return 0;
//    }
//    public static long factorial(){
//        String yesNo = "Y";
//        while(yesNo.equalsIgnoreCase("y")){
//            System.out.println("Enter a number between 1 - 10");
//            Scanner input = new Scanner(System.in);
//            int number = input.nextInt();
//            int startValue = 1;
//            String middleString = "";
//
//            for(int i = 1;i <= number; i++){
//                startValue *= i;
//                if(middleString.isEmpty()){
//                    middleString += i;
//                }else{
//                    middleString += " x " + i;
//                }
//                System.out.println(i + " ! = " + middleString + " = " + startValue);
//            }
//        System.out.println("would you like to continue");
//        Scanner userContinue = new Scanner(System.in);
//        yesNo = userContinue.nextLine();
//            return 0;
//        }
//        return 0;
//    }
//    public static void rollDice(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter how many sides for each dice");
//        int diceSides = input.nextInt();
//
//        int diceOne =(int) (diceSides*Math.random()+1);
//        int diceTwo =(int) (diceSides*Math.random()+1);
//
//        System.out.println("The first dice is = " + diceOne);
//        System.out.println("The Second dice is = " + diceTwo);
//
//
//    }
//    public static int ranInt(){
//        double randomTarget = Math.random();
//        double x = randomTarget * 100;
//        int randomInt = (int)x;
//        return randomInt;
//    }
//    public static void higLow(){
//        ranInt();
//        Scanner input = new Scanner(System.in);
//        //random number generator 1-100
//
////        System.out.println("randomInt = " + randomInt);
//        System.out.println("Enter a number from 1-100");
//        int usersNumber = input.nextInt();
//        if(usersNumber < randomInt){
//            System.out.println("Too Low, the number was " + randomInt);
//        } else if( usersNumber > randomInt){
//            System.out.println("To high the number was " + randomInt);
//        } else{
//            System.out.println("You got it! the number is " + randomInt);
//        }
//
//    }
//    public static double getRandomIntegerBetweenRange(double min, double max){
//        double number = (int)(Math.random()*((max-min)+1))+min;
//        return number;
//    }
//
//    public static void guessTheNumber () {
//        Scanner guessed = new Scanner(System.in);
//        double num = (int) getRandomIntegerBetweenRange(1, 100);
//        System.out.println("Please guess the random number between 1 and 100");
//        int secondResponse = guessed.nextInt();
//        int guessCount = 1;
//        int guessLimit = 3;
//        boolean outOfGuesses = false;
//
//        while (secondResponse != num) {
//            if (guessCount < guessLimit) {
//                if (secondResponse < num) {
//                    System.out.println("HIGHER!");
//                    System.out.println("Guess again");
//                    secondResponse = guessed.nextInt();
//                    guessCount++;
//
//                } else if (secondResponse > num) {
//                    System.out.println("LOWER!");
//                    System.out.println("Guess again");
//                    secondResponse = guessed.nextInt();
//                    guessCount++;
//
//                }
//            } else {
//                outOfGuesses = true;
//                System.out.println("Sorry! You ran out of guesses. The Correct number is "+num );
//                break;
//            }
//        }
//
//        if (secondResponse == num) {
//            System.out.println("Correct, Good Guess.");
//        }
//    }


