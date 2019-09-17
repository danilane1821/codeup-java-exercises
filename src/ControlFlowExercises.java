public class ControlFlowExercises {

   public static void main (String[] args) {
       //DO WHILE LOOPS
//       int i = 100;
//
//       do {
//           System.out.println(i);
//             i  -=5;
//       }while(i >= -10);

//       long i = 2;
//
//       do{
//           System.out.println(i);
//           i *= i;
//       }while(i < 1000000);
//       }

       //refactor with 4 loop

//       for (int i = 100; i >= -10; i -= 5) {
//           System.out.println(i);
//       }

       for(long i = 2; i < 1000000; i*=i){
           System.out.println(i);
       }
   }
}
