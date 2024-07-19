package String;

public class StringBufferExample {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("naman");
//        System.out.println(sb.append(" xyz"));
//        System.out.println(sb.reverse()); // not use in STRING only in STRING BUFFER

        String str = "Naman";
        StringBuffer sb = new StringBuffer(str);
        String str2 = sb.reverse().toString();
        if (str.equalsIgnoreCase(str2)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }

    }
}
