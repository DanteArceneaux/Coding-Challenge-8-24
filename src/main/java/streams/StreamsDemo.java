package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {
    public static void show(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 10));
        movies.add(new Movie("The Godfather", 15));
        movies.add(new Movie("The Godfather: Part II", 20));

        //imperative style
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > 10) {
                count++;
            }
        }

        //functional style
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
    }
}
