import java.util.ArrayList;

public class Course {

    private String courseTitle;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseTitle, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
