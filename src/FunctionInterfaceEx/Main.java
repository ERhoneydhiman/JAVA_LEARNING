package FunctionInterfaceEx;

public class Main {
    public static void main(String[] args) {

//        Normal Approach.
//        FIClass f1 = new FIClass();
//        System.out.println(f1.calculate(4));


//        Lambda with Functional Interface

        Calculator<Double> square = (Double x) -> x*x;
        Calculator<Double> circleArea = (Double x) -> 3.14*x*x;
        Calculator<Double> squarePerimeter = (Double x) -> 4*x;

        System.out.println(square.calculate(6.0));
        System.out.println(circleArea.calculate(6.0));
        System.out.println(squarePerimeter.calculate(6.0));
    }
}
