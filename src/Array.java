import java.util.*;

public class Array {
    public static void main(String[] args) {
//        int nameOfArray[] = {1,2,3,4,5};
//
//        int[] nameOfArray2= {2,3,4,5,6};
//
//        int[] x, y; // x and y both are array
//        int a[], b; // a is array b is simple int
//
//        for (int i = 0;i < nameOfArray.length; i++){
//            System.out.println(nameOfArray[i]);
//        }

// one D array
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter no of elements; ");
//        int n = sc.nextInt();
//
//        int[] userArray = new int[n];
//
//        System.out.println("enter array elements: ");
//        for (int i = 0; i <n; i++){
//            userArray[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0;i<n;i++){
//            sum = sum + userArray[i];
//        }
//        double avg = (double) sum /n;
//        System.out.println(avg);



//        two D array
        int twodArray[][] = new int [3][3];
        System.out.println("enter elements: ");
        for(int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                twodArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0;i<3;i++){
            for (int j = 0; j < 3;j++){
                System.out.print(twodArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//que1 :- sum of two matrix and transpose of matrix (done)
//que2 :- sorting of array.
