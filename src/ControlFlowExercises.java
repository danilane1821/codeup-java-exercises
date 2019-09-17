import java.util.Scanner;

public class ControlFlowExercises {

   public static void main (String[] args) {
    //TABLE OF POWERS
      Scanner input = new Scanner(System.in);

       System.out.println("Enter a number");
       int startValue = 1;
       int num = input.nextInt();
       for (int row =0; row < num; row++){
              int y = 1;
           for (int col = startValue; col < startValue+3; col ++)
           {
               y = y *startValue;
               System.out.print(y + " " );
           }
           System.out.println();
           startValue++;
       }

       }

}
