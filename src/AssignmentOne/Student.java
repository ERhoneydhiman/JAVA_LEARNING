package AssignmentOne;

import OOPS.Address;

public class Student extends Person {

//    10. Write a Java program to create a class called "Student" with a name,
//    grade, and courses attributes, and methods to add and remove courses.
    private final String course;
    private final double fees;
    private final String  contact;

    public Student(int age, String name, String contact, String course, double fees){
        super(name, age);
        this.course = course;
        this.fees = fees;
        this.contact = contact;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Name of Person is "+contact);
        System.out.println("Age of Person is "+course);
        System.out.println("Age of Person is "+fees);
    }

}
