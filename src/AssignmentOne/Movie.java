package AssignmentOne;

import java.util.ArrayList;

public class Movie {
//    17. Write a Java program to create a class called "Movie" with attributes for
//    title, director, actors, and reviews, and methods for adding and retrieving
//    reviews.
    String title;
    String director;
    ArrayList<String> actors;
    ArrayList<String> reviews ;

    public Movie(String title, String director, ArrayList<String > actors){
        this.actors = actors;
        this.director = director;
        this.title = title;
        this.reviews = new ArrayList<>();
    }

    public void addReviews(String review){
        reviews.add(review);
    }

    public void displayDetails(){
        System.out.println("\tTitle: "+title);
        System.out.println("Director: "+ director);
        System.out.println("Actors: ");
        for (String actor: actors){
            System.out.println(actor);
        }
        System.out.println("Reviews: ");
        try {if (reviews.isEmpty()){
            throw new NullPointerException();
        }
            for (int i = 0; i < reviews.size(); i++) {
                System.out.println(i+1 +". "+ reviews.get(i));
            }
        }catch (NullPointerException ex){
            System.out.println("No reviews yet!!");
        }finally {
            System.out.println("Add reviews if you watched this movie.");
        }

    }

}
