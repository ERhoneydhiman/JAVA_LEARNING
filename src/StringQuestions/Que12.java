package StringQuestions;

public class Que12 {
    // number of occurrences of a char in a string
    public static void main(String[] args) {
        String str = "kjljklkjhjkji";
        char  ch = 'j';

        String ch_str = Character.toString(ch);
        String str_copy = str.replaceAll(ch_str, "");

        int no_of_char = str.length() - str_copy.length();
        System.out.println(no_of_char);
    }
}
