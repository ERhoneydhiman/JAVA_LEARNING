package RandomQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class SquaresSortedArray {
    // QUE 977 : Given an integer array nums sorted in
    // non-decreasing order, return an array of the
    // squares of each number sorted in non-decreasing order.
    public static int[] sortedSquares(int[] nums) {
        int[] sq_arr =new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sq = nums[i] *nums[i];
            sq_arr[i] = sq;
            for (int j = 0; j < sq_arr.length; j++) {
                if (sq_arr[i]<sq_arr[j]){
                    int temp = sq_arr[j];
                    sq_arr[j] = sq_arr[i];
                    sq_arr[i]=temp;
                }
            }
        }

        return sq_arr;
    }
    public static void main(String[] args) {
        int[] nums = {-4, -3, 0, 2, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }


}
