package StringQuestions;

public class Que1 {
    public static void main(String[] args) {

        // to check string is immutable.
        String full_name = "honey"; // simple assignment a value
        String name = full_name; // give reference to another variable
        full_name = full_name + " dhiman"; // concat in full_name


        System.out.println(full_name); // output: honey dhiman
        System.out.println(name); // output: honey
    }
}
