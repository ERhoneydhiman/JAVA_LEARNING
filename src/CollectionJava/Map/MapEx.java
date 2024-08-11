package CollectionJava.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer, String > students = new HashMap<>();
        students.put(101, "Rahul");
        students.put(102, "Rohan");
        students.put(103, "Raghav");
        students.put(104, "Ramesh");
//        HashMap<Integer, String > set2 = (HashMap<Integer, String>) students.clone();
        Object set2 = students.clone();
        students.put(105, "Rohit");
        students.remove(102);
//        students.clear();
        System.out.println(students.get(103));
        System.out.println(students.entrySet());
        System.out.println(students.keySet());
        System.out.println(students.isEmpty());
        System.out.println(students.containsKey(104));
        System.out.println(set2);
        System.out.println(students.values());

    }
}
