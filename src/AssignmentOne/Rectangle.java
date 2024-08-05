package AssignmentOne;

public class Rectangle {
//    3. Write a Java program to create a class called "Rectangle" with width and
//    height attributes. Calculate the area and perimeter of the rectangle.

    private final double width; private final double height;
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double area(){
        double a = width * height;
        return a;
    }public double perimeter(){
        double p = (width+height)*2;
        return p;
    }
}
