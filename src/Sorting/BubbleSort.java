package Sorting;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,8,4,6,1,3, 7, 8, 9 ,3};

        for (int i = 0; i<arr.length; i++){
            for (int j = 0;j< arr.length; j++){
                if (arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
