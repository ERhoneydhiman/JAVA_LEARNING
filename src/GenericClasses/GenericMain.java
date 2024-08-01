package GenericClasses;

public class GenericMain {
    public static void main(String[] args) {
        GenericTest<Integer> gt = new GenericTest<>(10);
        gt.show();

        Student st1 = new Student(101, "rakesh");
        GenericTest gt1 = new GenericTest(st1);
        gt1.show();

    }
}
