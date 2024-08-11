package AssignmentOne;

public class Course {
//    23. Write a Java program to create a class called "Course" with attributes for
//    course name, instructor, and credits. Create a subclass "OnlineCourse" that
//    adds attributes for platform and duration. Implement methods to display
//    course details and check if the course is eligible for a certificate based on
//    duration.

    String courseName;
    String instructor;
    Double credits;

    public Course(String courseName, String instructor, Double credits){
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }

    public String displayCourse() {
        return "\tCourse\t"+ "\nCourse name: "+courseName+"\nInstructor: "+instructor+"\nFees: "+credits;
    }
}
