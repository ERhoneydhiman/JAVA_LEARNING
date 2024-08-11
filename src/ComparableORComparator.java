import AssignmentOne.AgeComparator;
import AssignmentOne.CourseComparator;
import AssignmentOne.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ComparableORComparator {
//    use is sorting of complex objects.
//    they both are interfaces.
    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<>();

        Student s1 = new Student(101, 20, "raj","raj@main","B.tech", 24000.0);
        stuList.add(s1);

        Student s2 = new Student(104, 24, "jay","jay@main","bca", 20000.0);
        stuList.add(s2);

        Student s3 = new Student(103, 26, "anu","anu@main","bca", 20000.0);
        stuList.add(s3);

        Student s4 = new Student(102, 23, "vivek","vivek@main","B.tech", 3000.0);
        stuList.add(s4);

        Student s5 = new Student(105, 25, "rahul","rahul@main","ba", 20000.0);
        stuList.add(s5);

        Student s6 = new Student(100, 22, "rohan","rohan@main","bca", 20000.0);
        stuList.add(s6);

//        Collections.sort(stuList);
//        Collections.sort(stuList);
//        System.out.println(stuList);

        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        switch (x){
//            case 1:
//                Collections.sort(stuList,new NameComparator());
//                break;
//            case 2:
//                Collections.sort(stuList,new IDComparator());
//                break;
//            case 3:
//                Collections.sort(stuList,new CourseComparator());
//                break;
//            case 4:
//                Collections.sort(stuList, new AgeComparator());
//                break;
//            default:
//                System.out.println("something wrong!!!!!");
//        }

//        System.out.println(stuList);


//        STREAM
        Stream<Student> stream = stuList.stream();
        stream.sorted(new IDComparator())
        .map(Student::toString).forEach(System.out::println);

        stream.map(Student::toString).forEach(System.out::println);

    }
}
