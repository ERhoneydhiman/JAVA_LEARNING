package AssignmentOne;

public class TrafficLight {
//    8. Write a Java program to create class called "TrafficLight" with attributes for
//    color and duration, and methods to change the color and check for red or
//    green.

    private String color;
    private final int duration_in_minutes;

    public TrafficLight(String color, int time){
        this.color = color;
        this.duration_in_minutes = time;
    }

    public void changeColorTo(String color){
        this.color = color;
    }

    public void checkColor(){
//        this.color = color;
        switch (this.color){
            case "red":
                System.out.println(color);
                System.out.println("Stop!!! wait for "+duration_in_minutes+" minutes.");
                break;
            case "yellow":
                System.out.println(color);
                System.out.println("Ready to Go!!!wait for "+duration_in_minutes+ " minutes.");
                break;
            case "green":
                System.out.println(color);
                System.out.println("Go!!!");
                break;
            default:
                System.out.println("Something went wrong!!!");
                break;
        }
    }
}
