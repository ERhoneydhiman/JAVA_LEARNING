package StringQuestions;

import java.util.ArrayList;

public class Que8 {
    // Split a string without  method
    public static void main(String[] args) {
        String  str= "hey! i am honey";
        ArrayList<String> str_arr = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        str = str+" ";
        for (int i = 0;i<str.length(); i++){
            if(str.charAt(i) != ' '){
                temp.append(str.charAt(i));
            }else {
                str_arr.add(String.valueOf(temp));
                temp = new StringBuilder("");
            }
        }
        System.out.println(str_arr);
    }
}
