package StringQuestions;

public class Que7 {
    // to remove a given char from a string.
    public static void main(String[] args) {
        String str = "honesy";
        String new_str = "";
        char removable_char = 's';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == removable_char){
                continue;
            }
            new_str = new_str+str.charAt(i);
        }
        System.out.println(new_str);
    }
}
