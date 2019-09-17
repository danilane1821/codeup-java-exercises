

public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Hello, World!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "My Name is Dani";
        System.out.println(myString);

//Change your code to assign a character value to myString. What do you notice
//        myString = (char) 's';
//        System.out.println(myString);
//this does not work because a string can not be defined with single quotes,
// only a char can and they are incompatible types


//Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159;
//this does not work because you can not assign a number to a string it is
//incompatible types;



//Declare an long variable named myNumber, but do not assign anything to it.
// Next try to print out myNumber to the console. What happens?
        Float myNumber;
//        System.out.println(myNumber);
//this does not work because we can not print a variable in java without assigning
// it or initializing it.


//Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14;

//this does not work because 3.14 is an incomparable type with "LONG", 3.14 is a FLOAT



//Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;
//this works because its a LONG and matching data types


//Change your code to assign the value 123 to myNumber.
//        myNumber = 123;

//this works because the number smaller than a long


//Why does assigning the value 3.14 to a variable declared as a long not compile,
// but assigning an integer value does?

// because 3.14 is considered a FLOAT and is not comparable with a LONG.
// Int works because 123 is less than both LONG and INT



//Change your code to declare myNumber as a float. Assign the value 3.14 to it.
// What happens? What are two ways we could fix this?

//        myNumber = 3.14F;

//we have to add a capital F or (FLOAT) at the end nd beginning so it recognizes its a float
// otherwise it assumes its a double



//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);


        int x = 5;
        System.out.println(++x);
        System.out.println(x);


//The first code block logs 5 then increments.
//the second one increments first and then logs the number


//Try to create a variable named class. What happens?
//        you can not name a variable class it is a reserved word


// Object is the most generic type in Java. You can assign any value to a variable of type Object.
// What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(o);

        // you get an error because the string cant be cast to a class of int.


//How is the above example different from the code block below?
//        int three = (int) "three";

// you can not cast an int to a string and the intentions are clear.. not a much as the above code because of the object


// Rewrite the following expressions using the relevant shorthand assignment operators:
//
//        int x = 4;
//        x = x + 5;
//
//        x += 5
//----------------------------

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        y *= x;
//------------------------------

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//            x /= y;
//            y -= x;


//----------------------------------



//What happens if you assign a value to a numerical variable that is larger
// (or smaller) than the type can hold?
// What happens if you increment a numeric variable past the type's capacity?

        //It cycles between


    }
}
