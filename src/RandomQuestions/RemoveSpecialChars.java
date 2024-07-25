package RandomQuestions;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        String special_chars = "!@#$%^&*";
        String str = "h&on$e%y";
        StringBuilder ans = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
//            char x = str.charAt(i);
            if(special_chars.contains(Character.toString(str.charAt(i)))){
                continue;
            }
            ans.append(str.charAt(i));
        }

        System.out.println(ans);
    }
}
