package AssignmentOne;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.course.compareTo(o2.course);
    }
}
