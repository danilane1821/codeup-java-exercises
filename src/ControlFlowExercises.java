public class ControlFlowExercises {

   public static void main (String[] args) {
    //FIZZBUZZ

//       for(int i = 1; i <= 100; i++){
//           System.out.println(i);
//       }

       for(int i = 1; i <= 100; i++){
            if(i == 15){
                System.out.println("FIZZBUZZ");
            }else if(i % 3 == 0){
                System.out.println("FIZZ");
            }else if(i % 5 == 0){
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }
       }


   }
}
