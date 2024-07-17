package OneDArray_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOfArray {

    public static int[] InputArray(int N){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[N];
        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static String sort(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            for (int j = 0;j< arr.length; j++){
                if (arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of element: ");
        int n = sc.nextInt();
        System.out.println("ENTER ELEMENTS: ");
        int [] myArray = InputArray(n);
        System.out.println("ORIGINAL ARRAY IS : " + Arrays.toString(myArray));
        System.out.println("SORTED ARRAY IS : "+sort(myArray));
    }
}
