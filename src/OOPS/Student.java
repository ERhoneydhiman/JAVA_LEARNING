package OOPS;

public class Student {
     private int id;
     private String n;
     private String c;
     private double f;

     public Student(int id, String name , String course, Double fee){
         this.id = id;
         this.n = name;
         c = course;
         f = fee;
     }

     public void displayInfo(){
         System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-");
         System.out.println("NAME is: "+ n);
         System.out.println("ID is: "+ id);
         System.out.println("COURSE is: "+ c);
         System.out.println("FEES is: "+ f);
     }
}
