package RandomQuestions;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"abab", "aba", "abc"};
        String common_prefix = "";

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr.length; j++){
                if (arr[i].length() < arr[j].length()){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr[0].length(); i++) {
            for (int j = 1; j<arr.length; j++){
                if (arr[0].charAt(i) == arr[1].charAt(i)){
                    common_prefix += arr[0].charAt(i);
                }else{
                    break;
                }
            }

        }
        System.out.println(common_prefix);
    }
}
