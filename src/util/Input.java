package util;

import java.util.Scanner;

public class Input {
private Scanner scanner;

public Input () {
this.scanner = new Scanner(System.in);
}




public boolean yesNo () {
    System.out.println("Y/N?");
    String answer = this.scanner.nextLine();
   return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");

}

    public String getString () {
        System.out.println("enter message");
        return this.scanner.nextLine();
    }



    public int getInt(int min, int max) {
       System.out.println("Please enter a number");
        int number = Integer.parseInt(this.scanner.nextLine());
        if(number >=min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
        }
        return getInt(min, max);
    }


    double getDouble(double min, double max) {
        System.out.println("Please enter a number");
        Double number = Double.parseDouble(this.scanner.nextLine());
        if(number >=min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
        }
        return getDouble(min, max);
    }

    public int getInt () {
        System.out.println("enter a decimal number");
       return Integer.parseInt(this.scanner.nextLine());


    }

    public double getDouble () {
        System.out.println("enter a number with a decimal");
        return Double.parseDouble(this.scanner.nextLine());
    }


}


