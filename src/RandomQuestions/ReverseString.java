package RandomQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String st1 = "hello";
        String st2 = "honey";


        // method 1
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();

        char[] stArr = st1.toCharArray();

        for (int i = stArr.length-1; i >= 0; i--) {
            ans1.append(stArr[i]);
        }
        System.out.println(ans1);


        // method 2

        for (int i = st2.length()-1; i >= 0; i--) {
            ans2.append(st2.charAt(i));
//            System.out.println(st.charAt(i));
        }
        System.out.println(ans2);
    }
}
