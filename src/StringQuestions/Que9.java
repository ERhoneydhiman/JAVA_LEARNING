package StringQuestions;

public class Que9 {
    // remove all white spaces
    public static void main(String[] args) {
        String str = "hello devs";
        String new_str = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
            new_str = new_str + str.charAt(i);
            }
        }
        System.out.println(new_str);
    }
}
