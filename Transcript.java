public class Transcript {
    private String course;
    private double grade;

    public Transcript(double grade, String course) {
        this.grade = grade;
        this.course = course;
    }

    public double getGrade(){
        return this.grade;
    }

    public void setGrade(double grade){
        setGrade(grade);
    }

    public String getCourse(){
        return this.course;
    }

    public void setCourse(String course){
        setCourse(course);
    }
}
