package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei) {

        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <=ei){
            if (arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++; idx1++;
            }else{
                merged[x] = arr[idx2];
                x++; idx2++;
            }
        }
        while (idx1 <= mid){
            merged[x] = arr[idx1];
            x++; idx1++;
        }
        while (idx2 <= ei) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i = 0, j= si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        int mid = si + (ei - si) / 2;
        if (si>=ei){
            return;
        }
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int[] arr = {7,8,4,6,1,3};
        int n = arr.length;
        divide(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
