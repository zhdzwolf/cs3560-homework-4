package aggregation_files;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(Instructor instructor, Textbook textbook) {
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void print() {
        System.out.println(courseName + ", " + instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName()
        + "; " + textbook.getTitle() + ", by " + textbook.getAuthor() + ", published by " + textbook.getPublisher());
    }
}