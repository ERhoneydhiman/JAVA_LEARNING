package AssignmentOne;

public class Employee {
//    6. Write a Java program to create a class called "Employee" with a name, job
//    title, and salary attributes, and methods to calculate and update salary.

//    9. Write a Java program to create a class called "Employee" with a name,
//    salary, and hire date attributes, and a method to calculate years of service.

    private final String name;
    private final String job_title;
    private  double salary;


    public Employee(String name, String job_title, double salary){
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    private double calculateSalary(double inc){
         salary = salary + (salary*(inc/100));
        return salary;
    }
    public void updateSalary(double inc){
        double updated_salary = calculateSalary(inc);
        salary = updated_salary;
        System.out.println("___________________________________________");
        System.out.println("Updated salary is : "+ salary);
    }
    @Override
    public String  toString(){
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
        return "Name:- "+ name+"\nJob Title:- "+job_title+"\nSalary is:- "+salary;
    }
}
