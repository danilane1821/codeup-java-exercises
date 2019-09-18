import java.util.Scanner;

public class ControlFlowExercises {

   public static void main (String[] args) {
       //GRADES
       Scanner grade = new Scanner(System.in);


       do {
           System.out.println("Enter grade");
           int grades = Integer.parseInt(grade.nextLine());

           if (grades <= 100 && grades >= 88) {
               System.out.println("You received an A");
           } else if (grades <= 87 && grades >= 80) {
               System.out.println("You received a B");
           } else if (grades <= 79 && grades >= 67) {
               System.out.println("You received a C");
           } else if (grades <= 66 && grades >= 60) {
               System.out.println("You received a D");
           } else if (grades <= 59 && grades >= 0)
               System.out.println("You received an F");


       System.out.println("Enter another grade? Y/N");
        } while (grade.nextLine().equalsIgnoreCase("y"));



   }

}
