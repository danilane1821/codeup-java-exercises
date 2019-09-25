package movies;



public class Movie {
    private String movieName;
    private String movieCategory;

    public Movie (String name, String movieCategory) {

    setMovieName(name);
    setMovieCategory(movieCategory);

    }

     public String getMovieName() {
        return this.movieName;
     }

     public void setMovieName(String movieName) {
        this.movieName = movieName;
     }

     public String getMovieCategory (){
        return this.movieCategory;
     }

     public void setMovieCategory (String movieCategory) {
       this.movieCategory = movieCategory;
     }

}
