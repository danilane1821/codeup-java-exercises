import java.util.Scanner;

public class ControlFlowExercises {

   public static void main (String[] args) {
    //GRADES
      Scanner grade = new Scanner(System.in);
       System.out.println("Enter grade");
       int grades = grade.nextInt();

       if (grades >= 88) {
           System.out.println("You received an A");
       } else if (grades >= 87) {
           System.out.println("You received a B");
       } else if (grades >= 79) {
           System.out.println("You received a C");
       } else if (grades >= 66) {
           System.out.println("You received a D");
       } else {
           System.out.println("You received an F");
       }

   }


}
