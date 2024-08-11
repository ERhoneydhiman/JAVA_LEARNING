package CollectionJava.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(22);
        set.add(32);
        set.add(45);
        set.add(22);

        Iterator<Integer> it = set.iterator();

        System.out.println(it.hasNext());
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
