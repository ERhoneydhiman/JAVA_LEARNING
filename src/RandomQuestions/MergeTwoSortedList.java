package RandomQuestions;

import java.util.Arrays;

public class MergeTwoSortedList {
    public static int[] mergeTwoLists(int[] list1, int[] list2) {
        int[] merged = new int[list2.length + list1.length];
        int idx1 = 0;
        int idx2 = 0;
        int x = 0;
        while(idx1 <= list1.length-1 && idx2 <=list2.length-1){
            if (list1[idx1] <= list2[idx2]){
                merged[x] = list1[idx1];
                idx1++;
            }else{
                merged[x] = list2[idx2];
                idx2++;
            }
            x++;
        }
        while (idx1 <= list1.length-1){
            merged[x++] = list1[idx1++];
        }
        while (idx2 <= list2.length-1){
            merged[x++] = list2[idx2++];
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 3, 5};
        int[] list2 = {2, 4, 6};
        System.out.println(Arrays.toString(mergeTwoLists(list1, list2)));
    }
}
