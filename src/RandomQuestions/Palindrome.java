package RandomQuestions;

public class Palindrome {


        public static boolean isPalindrome(int x) {
            String str = Integer.toString(x);
            int first = 0;
            int last = str.length()-1;
            while (first<last){
                if (str.charAt(first) != str.charAt(last)){
                    return false;
                }
                first++;
                last--;
            }
            return true;
        }



    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));

    }
}
