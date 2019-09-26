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
        for (Person people : people) {
            System.out.println(people.getName());
        }
        addPerson(people, new Person("bob"));



//Walkthrough answer//////////////////////////////////////////////////////

        //or Person[] people = {
        // new Person("danielle", "lane"),
        // new Person ("Bev" , "lastname"),
        // new Person("Eddy", "lastname")
        // };

        //public static person[] addPerson(Person[] people, Person p){
        //Person[] ouput = new Person[people.length+1]
        //return output

        //}


        //addPerson(people, new Person("Cathy", "Smith"));

        //for(Person person: people) {
        //system.out.println(person.getName());
//    }

    }
//////////////////////////////////////////////////////////////////////////////

//Create a static method named addPerson. It should accept an array of Person objects,
// as well as a single person object to add to the passed array.
//It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static void addPerson(Person[] people, Person newPeople) {
        Person[] newList = Arrays.copyOf(people, people.length + 1);
        newList[newList.length - 1] = newPeople;
        for (Person Person : newList) {
            System.out.println(Person.getName());
        }

    }





}
