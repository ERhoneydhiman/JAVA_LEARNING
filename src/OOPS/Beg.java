package OOPS;

public class Beg {
    private int pocket_no;
    private String color;
    public Beg(int pocket_no, String color){
     this.color = color;
     this.pocket_no = pocket_no;
    }
    public void showColor(){
        System.out.println("color is: "+color);
    }
    public void zip(){
        System.out.println("zip close or open.");
    }
}
