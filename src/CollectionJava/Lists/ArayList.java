package CollectionJava.Lists;

import java.util.ArrayList;

public class ArayList {
    public static void main(String[] args) {
        ArrayList<Integer> my_list =new ArrayList<>();


        my_list.add(23);
        my_list.add(43);
        my_list.add(76);
        my_list.add(98);

        ArrayList<Integer> list2 = (ArrayList<Integer>) my_list.clone();


        System.out.println(my_list);
        System.out.println(list2);
    }
}
