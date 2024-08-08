package AssignmentOne;

import OOPS.Address;

public class Student extends Person implements Comparable<Student>{

//    10. Write a Java program to create a class called "Student" with a name,
//    grade, and courses attributes, and methods to add and remove courses.
    public final String course;
    private final double fees;
    private final String  contact;
    public final Integer id;

    public Student(int id,int age, String name, String contact, String course, double fees){
        super(name, age);
        this.course = course;
        this.fees = fees;
        this.contact = contact;
        this.id = id;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Name of Person is "+contact);
        System.out.println("Age of Person is "+course);
        System.out.println("Age of Person is "+fees);
    }


    @Override
    public String toString() {
        return "\nID: "+id+"\nName: "+name+"\nAge: "+age+"\nCourse: "+course+"\n------------------------------";
    }


    @Override
    public int compareTo(Student stu) {
        return this.name.compareTo(stu.name);
    }
}
