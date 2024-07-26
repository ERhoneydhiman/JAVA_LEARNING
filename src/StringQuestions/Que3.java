package StringQuestions;

public class Que3 {
    public static void main(String[] args) {

        // reverse a string.
        String str = "reverse the string";

        StringBuilder reversed_str= new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            reversed_str.append(str.charAt(i));
        }
        System.out.println(reversed_str);
    }
}
