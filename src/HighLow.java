import java.util.Scanner;



public class HighLow {
    public static void main(String[] args) {
    guessTheNumber();

    }


    public static double getRandomIntegerBetweenRange(double min, double max){
        double number = (int)(Math.random()*((max-min)+1))+min;
        return number;
    }

    public static void guessTheNumber () {
        Scanner guessed = new Scanner(System.in);
        double num = (int) getRandomIntegerBetweenRange(1, 100);
        System.out.println("Please guess the random number between 1 and 100");
        int response = guessed.nextInt();
        int guessCount = 1;
        int guessLimit = 3;

        while (response != num) {
            if (guessCount < guessLimit) {
                if (response < num) {
                    System.out.println("HIGHER!");
                    System.out.println("Guess again");
                    response = guessed.nextInt();
                    guessCount++;

                } else if (response > num) {
                    System.out.println("LOWER!");
                    System.out.println("Guess again");
                    response = guessed.nextInt();
                    guessCount++;

                }
            } else {
                System.out.println("Sorry! You ran out of guesses.");
                break;
            }
        }
        if (response == num) {
            System.out.println("Correct, Good Guess.");
        }
    }

}
