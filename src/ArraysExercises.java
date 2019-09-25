import java.util.Arrays;

public class ArraysExercises {

//Create an array that holds 3 Person objects
    static Person[] people = new Person[3];

    public static void main(String[] args) {
//What happens when you run the following code? why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//It returns [I@2f7c7260 without toString method instead of the numbers [1,2,3,4,5].


//Assign a new instance of the Person class to each element.

    people[0] = new Person("dani");
    people[1] = new Person("Bev");
    people[2] = new Person("Eddy");
//Iterate through the array and print out the name of each person in the array.
        for(Person people: people){
            System.out.println(people.getName());
//            people.sayHello();
        }





    }
}
