package OOPS;

public class Employee extends Person{
       private final String role;
       private final Double salary;

       public Employee(int id, String name, Address address, String contact,String role, double salary){
           super(id, name, address, contact);
           this.role = role;
           this.salary = salary;
       }

        public String getRole(){
                return role;
        }
        public Double getSalary(){
                return salary;
        }

    public void displayDetails(){
        System.out.println("******************************");
        super.displayAll();
        System.out.println("SALARY of employee is: "+ salary);
        System.out.println("employee work as : "+role);
    }
}
