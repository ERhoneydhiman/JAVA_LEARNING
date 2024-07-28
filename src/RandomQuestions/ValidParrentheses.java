package RandomQuestions;

public class ValidParrentheses {

    public static boolean isValid(String str) {
        while(true) {
            if (str.contains("()")){
                str = str.replace("()", "");
            }else if ( str.contains("{}")){
                str = str.replace("{}", "");

            }else if(str.contains("[]")){
                str = str.replace("[]", "");

            }else{
                return str.isEmpty();
            }
        }

    }
    public static void main(String[] args) {
        String str ="()[]{}";
        System.out.println(isValid(str));
    }
}
