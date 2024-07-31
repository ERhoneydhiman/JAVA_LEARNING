package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            double result = a/b;
            System.out.println(result);
        }catch (/*"Exception" can be used instead of two */ArithmeticException | InputMismatchException ex){
            // can use super class in catch block but use particular class is right practice
            System.out.println("Input Number must be non zero value and not char");
        }finally {
            System.out.println("final block");
        }
    }
}
