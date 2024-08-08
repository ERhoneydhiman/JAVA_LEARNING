package AssignmentOne;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student A1 ,Student A2){
        return A1.age.compareTo(A2.age);
    }
}
