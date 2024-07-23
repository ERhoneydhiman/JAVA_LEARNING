package OOPS;

public class Student extends Person{
        private  String course;
        private  double fees;

        public Student(int id, String name, Address address, String contect, String course, double fees){
                super(id, name, address, contect);
                this.course = course;
                this.fees = fees;

        }

        public String getCourse(){
                return course;
        }
        public Double getFees(){
                return fees;
        }

//        public void setCourse(String course){
//                this.course = course;
//        }
//
//        public void setFees(Double fees){
//                this.fees = fees;
//        }
}







//     private final int id;
//     private final String n;
//     public Student(int id, String name , String course, Double fee){
//         this.id = id;
//         this.n = name;
//         c = course;
//         f = fee;
//     }

//     public void displayInfo(){
//         System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-");
//         System.out.println("NAME is: "+ n);
//         System.out.println("ID is: "+ id);
//         System.out.println("COURSE is: "+ c);
//         System.out.println("FEES is: "+ f);
//     }
