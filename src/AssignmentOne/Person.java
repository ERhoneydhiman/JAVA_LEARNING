package AssignmentOne;

public class Person {
//    1. Write a Java program to create a class called "Person" with a name and
//    age attribute. Create two instances of the "Person" class, set their attributes
//    using the constructor, and print their name and age.

    protected String name ;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showDetails(){
//        System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
        System.out.println("Name of Person is "+name);
        System.out.println("Age of Person is "+age);
//        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
    }
}
