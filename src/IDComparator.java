import AssignmentOne.Student;

import java.util.Comparator;

public class IDComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Student p1 = o1;
        Student p2 = o2;

        return p1.id.compareTo(p2.id);
    }
}
