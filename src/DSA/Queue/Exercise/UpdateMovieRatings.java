package DSA.Queue.Exercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class UpdateMovieRatings {
    public static void main(String[] args) {
        Queue<Movie> movieQueue = new LinkedList<>();
        Movie m1 = new Movie("Dangal");
        Movie m2 = new Movie("Gangs of Wasseypur");
        Movie m3 = new Movie("Tubelight");
        Movie m4 = new Movie("Padvamat");
        movieQueue.add(m1);
        movieQueue.add(m2);
        movieQueue.add(m3);
        movieQueue.add(m4);
        updateRating(movieQueue);
    }

    private static void updateRating(Queue<Movie>  movieQueue) {
            int[] ratings={5,3,4,1};
        String[] movieTitles = { "Gangs of Wasseypur", "Padvamat", "Dangal", "Tubelight" };
        int size= movieQueue.size();
        for (int i=0; i < movieTitles.length;i++) {
            while(size > 0) {
                if (movieQueue.peek().getTitle()==movieTitles[i]) {
                    Movie m = movieQueue.remove();
                    m.setRating(ratings[i]);
                    movieQueue.add(m);
                    break;
                } else {
                    movieQueue.add(movieQueue.remove());
                }
                size--;
            }
        }
    }
}

class Movie {
    public String title;
    public int rating;
    public Movie(String title) {
        this.title=title;
        this.rating=0;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(int rating) {
        System.out.println("Giving " + rating + " star(s) to the movie " + this.title);
        this.rating = rating;
    }
}
