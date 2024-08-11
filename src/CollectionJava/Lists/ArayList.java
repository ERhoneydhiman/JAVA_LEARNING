package CollectionJava.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArayList {
    public static void main(String[] args) {
        ArrayList<Integer> my_list =new ArrayList<>();


        my_list.add(23);
        my_list.add(43);
        my_list.add(76);
        my_list.add(98);

        ArrayList<Integer> list2 = (ArrayList<Integer>) my_list.clone();
//        System.out.println(my_list);
//        System.out.println(list2);


        // Iterator.
        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
//      ListIterator
        System.out.println("---------------------------");
        ListIterator<Integer> li = list2.listIterator();

        System.out.println(li.next());

    }
}
