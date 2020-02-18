package main;

/*
 * Create a class IndependenceDay that inherits from Movie Class
 * 
Inside class IndependenceDay, defined a constructor which calls Movie's constructor

It also has a method with name plot() which returns Aliens attempt to take over planet earth
Print the movie's plot.
 */

public class Main {
    public static void main(String[] args) {
            Movie movie = new IndependenceDay();
            System.out.println(movie.plot());
    }
}
class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }
    public String getName() {
        return name;
    }
}
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }
    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}