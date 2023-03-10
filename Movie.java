import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private List<watch> watches;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.watches = new ArrayList<>();
    }

    public void addWatch(watch watch) {
        this.watches.add(watch);
        watch.setMovie(this);
    }
}