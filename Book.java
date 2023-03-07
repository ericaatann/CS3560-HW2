public class Book {
    private String name;
    private String author;
    Course course;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Other methods for Book class

    public void setCourse(Course course) {
        if (this.course != null) {
            this.course.removeTextbook(this);
        }
        this.course = course;
        if (course != null) {
            course.addTextbook(this);
        }
    }
}