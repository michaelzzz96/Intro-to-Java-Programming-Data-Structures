import java.util.ArrayList;
import java.util.Arrays;

public class Problem_11_5 {

    public static void main(String[] args) {
        Course course = new Course("Class");
        course.addStudent("Allen");
        course.addStudent("Bob");
        course.addStudent("Charlie");
        course.addStudent("David");
        course.addStudent("Ed");
        course.addStudent("Frank");
        course.addStudent("George");
        course.addStudent("Harini");
        course.dropStudent("David");
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Students: " + Arrays.toString(course.getStudents()));
        System.out.println("Student count: " + course.getNumberOfStudents());
    }

    static class Course {
        private final String courseName;
        private final ArrayList<String> students = new ArrayList<>();

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void addStudent(String student) {
            students.add(student);
        }

        public void dropStudent(String student) {
            students.remove(student);
        }

        public String getCourseName() {
            return courseName;
        }

        public int getNumberOfStudents() {
            return students.size();
        }

        public String[] getStudents() {
            return students.toArray(new String[students.size()]);
        }
    }


}
