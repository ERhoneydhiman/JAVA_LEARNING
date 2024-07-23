package OOPS;

public class Employee extends Person{
       private String role;
       private Double salery;

       public Employee(int id, String name, Address address, String contect,String role, double salery){
           super(id, name, address, contect);
           this.role = role;
           this.salery = salery;
       }

        public String getRole(){
                return role;
        }
        public Double getSalery(){
                return salery;
        }

//        public void setRole(String role){
//                this.role = role;
//        }
//
//        public void setSalery(Double salery){
//                this.salery = salery;
//        }
}
