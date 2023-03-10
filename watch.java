import java.util.ArrayList;
import java.util.List;
public class watch {
    private Person person;
    private Movie movie;
    private int rating;

    public watch(Person person, Movie movie, int rating) {
        this.person = person;
        this.movie = movie;
        this.rating = rating;
        person.addWatch(this);
        movie.addWatch(this);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}