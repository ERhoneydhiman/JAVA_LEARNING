package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceWithUserInput {

    public static void addStudents(Scanner sc, ArrayList<Student> students){
        int isYes;
        System.out.println("Start for adding details (enter 1 for yes & ANY OTHER key for no).");
        isYes = sc.nextInt();
        if (isYes == 1){
            while(isYes == 1){
                System.out.println("enter data...");
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter NAME: ");
                String name = sc.nextLine();

                System.out.print("Enter CONTACT: ");
                String contact = sc.nextLine();

                System.out.print("Enter COURSE: ");
                String course = sc.nextLine();

                System.out.print("Enter FEES: ");
                double fees = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter CITY: ");
                String city = sc.nextLine();

                System.out.print("Enter STATE: ");
                String state = sc.nextLine();

                System.out.print("Enter COUNTRY: ");
                String country = sc.nextLine();

                System.out.print("Enter ZIP CODE: ");
                int zip_code = sc.nextInt();

                Address address = new Address(city, state, country, zip_code);
                students.add(new Student(id, name, address, contact, course, fees));

                System.out.println("added");
                System.out.println("Add more(enter 1 for yes & 0 for no).");
                isYes = sc.nextInt();
            }
        }else {
            System.out.println("YOU CHOOSE NO \n x---TASK TERMINATED---x");
        }
    }


    public static void addEmployees(Scanner sc, ArrayList<Employee> students){
        int isYes;
        System.out.println("Start for adding details (enter 1 for yes & ANY OTHER key for no).");
        isYes = sc.nextInt();
        if (isYes == 1){
            while(isYes == 1){
                System.out.println("enter data...");
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter NAME: ");
                String name = sc.nextLine();

                System.out.print("Enter CONTACT: ");
                String contact = sc.nextLine();

                System.out.print("Enter ROLE: ");
                String role = sc.nextLine();

                System.out.print("Enter SALARY: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter CITY: ");
                String city = sc.nextLine();

                System.out.print("Enter STATE: ");
                String state = sc.nextLine();

                System.out.print("Enter COUNTRY: ");
                String country = sc.nextLine();

                System.out.print("Enter ZIP CODE: ");
                int zip_code = sc.nextInt();

                Address address = new Address(city, state, country, zip_code);
                students.add(new Employee(id, name, address,  contact, role,  salary));

                System.out.println("added");
                System.out.println("Add more(enter 1 for yes & 0 for no).");
                isYes = sc.nextInt();
            }
        }else {
            System.out.println("YOU CHOOSE NO \n x---TASK TERMINATED---x");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Student> students = new ArrayList<>();
        ArrayList <Employee> employees = new ArrayList<>();

        System.out.println("\nReg for Student or Employee. \n(enter 1 for student & 2 for employee & ANY OTHER key for no).");

        int check = sc.nextInt();
        if (check == 1){
            addStudents(sc, students);
            for(Student i : students){
                i.displayDetails();
            }
        }
        else if (check == 2) {
            addEmployees(sc, employees);
            for(Employee i : employees){
                i.displayDetails();
            }
        }else {
            System.out.println("wrong option\n x---TASK TERMINATED---x");
        }

        for(Student i : students){
            i.displayDetails();
        }
    }
}
