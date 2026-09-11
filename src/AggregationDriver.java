import aggregation_files.*;

public static void main(String[] args) {
    Instructor instructor1 = new Instructor();
    instructor1.setInstructorFirstName("Nima");
    instructor1.setInstructorLastName("Davarpanah");
    instructor1.setOfficeNumber("3-2636");

    Textbook textbook1 = new Textbook();
    textbook1.setTitle("Clean Code");
    textbook1.setAuthor("Robert C. Martin");
    textbook1.setPublisher("Addison-Wesley Professional");

    Course course1 = new Course(instructor1, textbook1);
    course1.setCourseName("CS3560");
    course1.print();

    Instructor instructor2 = new Instructor();
    instructor2.setInstructorFirstName("yeah");
    instructor2.setInstructorLastName("boi");
    instructor2.setOfficeNumber("the heavens");

    Textbook textbook2 = new Textbook();
    textbook2.setTitle("how to black mage");
    textbook2.setAuthor("the collective");
    textbook2.setPublisher("online guides");

    Course course2 = new Course(instructor2, textbook2);
    course2.setCourseName("final fantasy 14");
    course2.print();
}