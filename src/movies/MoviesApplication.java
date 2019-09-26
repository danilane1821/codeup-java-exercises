package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
//        input.getInt(1,5);

        MoviesArray obj = new MoviesArray();//get array of movies from movies array class
        Movie[] movieArray = obj.findAll();

        for(Movie movie : movieArray){
            System.out.println(movie.getMovieName());
        }



//        if(input.equals("1")){
//            System.out.println(movies.MoviesArray.findAll());
//        }else if(input.equals("2")){
//            System.out.println();
//        }else if(input.equals("3")){
//
//        }else if(input.equals("4")){
//
//        }else if(input.equals("5")){
//
//        }else{
//
//        }


    }
}
