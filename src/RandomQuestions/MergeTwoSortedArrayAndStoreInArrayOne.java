package RandomQuestions;

import java.util.Arrays;

public class MergeTwoSortedArrayAndStoreInArrayOne {
    public static void merge(int[] list1, int m, int[] list2, int n) {

        int idx1 = m - 1;
        int idx2 = n - 1;
        int mergeIndex = m + n - 1;


        while (idx1 >= 0 && idx2 >= 0) {
            if (list1[idx1] > list2[idx2]) {
                list1[mergeIndex] = list1[idx1];
                idx1--;
            } else {
                list1[mergeIndex] = list2[idx2];
                idx2--;
            }
            mergeIndex--;
        }


        while (idx2 >= 0) {
            list1[mergeIndex] = list2[idx2];
            idx2--;
            mergeIndex--;
        }
        System.out.println(Arrays.toString(list1));
    }

    public static void main(String[] args) {

        int[] list1 = {1, 3, 5, 0, 0, 0};
        int[] list2 = {2, 4, 6};


        merge(list1, 3, list2, 3);
    }


}
