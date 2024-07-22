package OOPS;

public class Student {
     private final int id;
     private final String n;
     private final String c;
     private final double f;

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
