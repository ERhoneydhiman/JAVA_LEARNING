package StringQuestions;

public class Que4 {
    // swap two variable of strings without third variable.
    public static void main(String[] args) {
        String st1 = "java";
        String st2 = "language";

        st1 = st1 + st2; //  firstsecond

        st2 = st1.substring(0,st1.length() - st2.length()); // first
        st1 = st1.substring(st2.length(), st1.length());

        System.out.println("st1 "+st1);
        System.out.println("st2 "+st2);
    }
}
