import java.util.List;
import java.util.ArrayList;

public class Course {
    private int code;
    private List<Book> textbooks;

    public Course(int code) {
        this.code = code;
        this.textbooks = new ArrayList<>();
    }

    public void addTextbook(Book textbook) {
        this.textbooks.add(textbook);
        textbook.course = this;
    }

    public void removeTextbook(Book textbook) {
        this.textbooks.remove(textbook);
        textbook.course = null;
    }

    // Other methods for Course class

}