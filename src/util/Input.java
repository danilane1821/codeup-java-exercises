package util;

import java.util.Scanner;

public class Input {
private Scanner scanner;

public Input () {
this.scanner = new Scanner (System.in);
}

boolean yesNo () {
    System.out.println("Y/N?");
   if(this.scanner.nextLine().equalsIgnoreCase("y")){

       return true;
   }else {
       return false;
   }

}

    String getString () {
        System.out.println("enter message");
        return this.scanner.nextLine();
    }


   int getInt(int min, int max) {
       System.out.println("Please enter a number");
        if (scanner.hasNextInt()) {
            int numInput = scanner.nextInt();
            if (numInput >= min && numInput <= max) {
                System.out.println(numInput + " is between 1 & 10!");
                return numInput;
            } else if (numInput < min || numInput > max) {
                System.out.println("This number is not valid, enter another number: ");
                return getInt(min, max);
            }
        } else {
            System.out.println("not a valid input! Enter a valid number: ");

        }
        return 0;
    }



    double getDouble(double min, double max) {
        System.out.println("Please enter a number");
        if (scanner.hasNextDouble()) {
            double numInput = scanner.nextDouble();
            if (numInput >= min && numInput <= max) {
                System.out.println(numInput + " is between 1 & 10!");
                return numInput;
            } else if (numInput < min || numInput > max) {
                System.out.println("This number is not valid, enter another number: ");
                return getDouble(min, max);
            }
        } else {
            System.out.println("not a valid input! Enter a valid number: ");

        }
        return 0;
    }


    public static void main(String[] args) {
        Input sc = new Input();
        System.out.println(sc.getString());
        System.out.println(sc.yesNo());
        System.out.println(sc.getInt(1,10));
        System.out.println(getDouble(1,10));
    }


}


