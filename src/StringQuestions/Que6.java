package StringQuestions;

import java.util.Arrays;

public class Que6 {
    // check two strings are anagrams or not
    public static void main(String[] args) {
        String st1 = "care";
        String st2 = "race";
        if (st1.length() != st2.length()) {
            System.out.println("no");
        } else {
            char[] charArr1 = st1.toCharArray();
            char[] charArr2 = st2.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);
            if (Arrays.equals(charArr1, charArr2)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
