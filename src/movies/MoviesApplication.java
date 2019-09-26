package movies;

import util.Input;


public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();

        displayMenu();


        int choice;
        boolean willContinue;


        do {
            displayMenu();
            choice = userInput.getInt(0,5);
           willContinue = processChoice(choice);
            System.out.println(willContinue);
        }while(willContinue);

        }




        public static boolean processChoice (int choice) {
        boolean output = true;
            switch (choice) {
                case 0:
                    System.out.println("EXIT!!");
                    output = false;
                    break;
                case 1:
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.println(movie.getMovieName());
                        break;
                    }
                case 2:

                    for (Movie movie : MoviesArray.findAll()) {
                        if(movie.getMovieCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                        }
                    }
                    break;
                case 3:

                    for (Movie movie : MoviesArray.findAll()) {
                        if(movie.getMovieCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                        }
                    }
                    break;

                case 4:

                    for (Movie movie : MoviesArray.findAll()) {
                        if(movie.getMovieCategory().equalsIgnoreCase("horror")) {
                            System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                        }
                    }
                    break;

                case 5:

                    for (Movie movie : MoviesArray.findAll()) {
                        if(movie.getMovieCategory().equalsIgnoreCase("scifi")) {
                            System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                        }
                    }
                    break;

            }

            return output;
        }

        public static void displayMenu () {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
        }


}
