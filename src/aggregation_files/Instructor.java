package aggregation_files;

public class Instructor {
    private String instructorFirstName;
    private String instructorLastName;
    private String officeNumber;

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }
    public void  setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }
    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }
    public String getInstructorLastName() {
        return instructorLastName;
    }
    public String getOfficeNumber() {
        return officeNumber;
    }
}