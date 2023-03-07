public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student() {

    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        setName(name);
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        setMajor(major);
    }

    public double getGPA() {
        return this.gpa;
    }

    public void setGPA(double gpa) {
        setGPA(gpa);
    }

    public String toString() {
        return "Name = " + name + "\nMajor = " + major + "\nGPA = " + gpa;
    }

    public boolean equals(aStudent student) {
        if (name == major) {
            return true;
        } else {
            return false;
        }
    }
}
