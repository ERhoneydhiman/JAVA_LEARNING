package RandomQuestions;

import java.util.Arrays;

public class SortingHieght {
    public static void main(String[] args) {
        String[] names = {"ram", "sam", "rahul", "mohit"};
        int[] heights = {4,3,8,5};
        String temp;
        int temp1;

        for (int i = 0; i < 4; i++) {
            for(int j = 0; j<4; j++){
                if (heights[i]<heights[j]){
//                    temp = names[j];
//                    names[j] = names[i];
//                    names[i] = temp;

                    temp1 = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp1;
                }
            }
        }
//        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(heights));
    }
}
