import java.util.Scanner;
public class ConsoleExercises {
    public static void main (String[] args){
//        double pi = 3.14159;
//        System.out.format("The Value of pi is approximately %.4s", pi);

        Scanner user = new Scanner(System.in);
//        System.out.print("Enter an  integer");
//        int userInput = user.nextInt();
//        System.out.println("You entered " + userInput);
        //What happens if you input something that is not an integer?
        //You get an error

//        System.out.println("Enter 3 words");
//        String firstWord = user.next();
//        String secondWord = user.next();
//        String thirdWord = user.next();
//        System.out.println("First word: " + firstWord);
//        System.out.println("Second word: " + secondWord);
//        System.out.println("Third word: " + thirdWord);

        //What happens if you enter less than 3 words?
        //It will not continue until you enter in a third word

        //What happens if you enter more than 3 words?
        //it ignores the 4th word

//        System.out.println("Enter a sentence");
//        String sentence = user.next();
//        System.out.println(sentence);
        //do you capture all of the words?
        //it only captured my first word.

//        System.out.println("Enter a sentence");
//        String sentence = user.nextLine();
//        System.out.println(sentence);
        //Now i got the full sentence

        System.out.println("Enter length");
        String value1 = user.nextLine();
        int length = Integer.parseInt(value1);

        System.out.println("Enter width");
        String value2 = user.nextLine();
        int width = Integer.parseInt(value2);

        System.out.println("Length:" + length);
        System.out.println("Width:" + width);

        System.out.println("area:" + (length * width));
        System.out.println("perimeter:" + (length * 2) + (width *2));

        //Bonus///







    }
}
