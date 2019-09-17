import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args){
        Scanner user = new Scanner(System.in);

//
//        double pi = 3.14159;
//        System.out.format("The Value of pi is approximately %.2f.", pi);
//
//        System.out.print("Enter an  integer");
//        int userInput = user.nextInt();
//        System.out.println("You entered " + userInput);
//        What happens if you input something that is not an integer?
//        You get an error
        // you can test your code by saying  System.out.println(userInput === 45);...you would get true or false;

//        System.out.println("Enter 3 words");
//        String firstWord = user.next();
//        String secondWord = user.next();
//        String thirdWord = user.next();
//        System.out.println("First word: " + firstWord);
//        System.out.println("Second word: " + secondWord);
//        System.out.println("Third word: " + thirdWord);
// or shorter way
//        System.out.print(firstWord + "\n" + secondWord+ "\n" + thirdWord);

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
        int length = Integer.parseInt(user.nextLine());

        System.out.println("Enter width");
        int width = Integer.parseInt(user.nextLine());

        System.out.println("Length:" + length);
        System.out.println("Width:" + width);

        int area = length * width;
        int perimeter = (length * 2) + (width *2);
//
        System.out.println("area:" + area);
        System.out.println("perimeter:" + perimeter);
//        we can test out code with this if we enters 2 for width and 2 for length
//        System.out.println(area == 4);
//        System.out.println(perimeter == 8);


        //Bonus///

//        System.out.println("Enter length");
//        double length = Double.parseDouble(user.nextLine());
//
//        System.out.println("Enter width");
//        double width = Double.parseDouble(user.nextLine());
//        double perimeter = (length * 2) + (width *2);
//        double area = (length * width);
//
//        System.out.println("The area is: " + area + "The perimeter is: " + perimeter);






    }
}
