import java.util.Scanner;

public class TestReview {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myInteger = 900;
        long morePrecise = myInteger;
//        System.out.println("Hello world");
//        System.out.println(morePrecise);

        String six = "6";
        boolean isItTrue = false;

        int num = 6;

        String name = "Danielle";
        System.out.println(name);

        System.out.println(name.length());
        System.out.println(name.indexOf("i"));
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        String newName = name.replace('D','S');
        System.out.println(newName);


//        String numToString = Integer.toString(num);
//        System.out.println(num);
//
//        int stringToNum = Integer.parseInt(six);
////        System.out.println(stringToNum);
//        System.out.println(takesInString(sc));

    }

        public static String takesInString(Scanner sc){
            System.out.println("say something");
           String said = sc.nextLine();
           return said;


        }



}
