package AssignmentOne;

public class Circle {
//    4. Write a Java program to create a class called "Circle" with a radius
//    attribute. You can access and modify this attribute. Calculate the area and
//    circumference of the circle.
    final double PI = 3.14;
    final float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public void getRadius(){
        System.out.println(radius);
    }
    public double area(){
        double A = PI*radius*radius;
        return A;
    }
    public double circumference(){
        double C = 2 * PI * radius;
        return C;
    }

}
