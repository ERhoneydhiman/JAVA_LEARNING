package OOPS;

import java.util.Scanner;
// user Gives input to make object of 'student' named class.
public class UserGivesObjectDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n]; // Student type Array.

        // taking input from user for Student class.
        for (int i = 0; i<n ; i++){
            System.out.println("Enter Details of Student" + i);
            System.out.println("Enter ID of student: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter NAME of student: ");
            String name = sc.nextLine();

            System.out.println("Enter COURSE of student: ");
            String course = sc.nextLine();

            System.out.println("Enter FEES of student: ");
            Double fees = sc.nextDouble();

            students[i] = new Student(id, name, course, fees);
        }
// Displaying Students details.
        System.out.println("Details of Students are...: ");
        for (Student student: students){
            student.displayInfo();
        }
    }
}
