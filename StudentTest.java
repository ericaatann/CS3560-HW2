public class StudentTest {
    public static void main(String[] args) {

        // Create a student with parameterized constructor
        Student john = new Student("John", "CS", 3.5);

        // Create a student with no-arg constructor
        Student maryAnn = new Student();
        maryAnn.setName("Mary Ann");
        maryAnn.setMajor("CE");
        maryAnn.setGPA(3.3);

        System.out.println(john.toString());
        // System.out.println(maryAnn.toString());
    }
}
