package RandomQuestions;

import java.util.Arrays;

public class SortingHieght {
    public static String [] sort(String[] arr1, int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j<arr2.length; j++){
                if (arr2[i] < arr2[j]) {
                    int tempHeight = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = tempHeight;

                    // Swap names to acc to heights.
                    String tempName = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tempName;
                }
            }

        }
        return arr1;
    }
    public static void main(String[] args) {
        String[] names = {"ram", "sam", "rahul", "mohit"};
        int[] heights = {10,4,8,2};

        System.out.println(Arrays.toString(sort(names, heights)));

    }
}
