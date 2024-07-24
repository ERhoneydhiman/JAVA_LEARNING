package OOPS;

public class Student extends Person{
        private final String course;
        private final double fees;

        public Student(int id, String name, Address address, String contact, String course, double fees){
                super(id, name, address, contact);
                this.course = course;
                this.fees = fees;

        }


        public String getCourse(){
                return course;
        }
        public Double getFees(){
                return fees;
        }


        public void displayDetails(){
                super.displayAll();
                System.out.println("FEES of student is: "+fees);
                System.out.println("student enrolled in : "+course);
        }
}