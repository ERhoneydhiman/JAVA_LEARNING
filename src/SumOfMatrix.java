import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
// initialization of variables:
        int[][] arrayOne = new int[2][2];
        int[][] arrayTwo = new int[2][2];
        int[][] sumArray = new int[2][2];

//        Taking Input From User for both Array
        System.out.println("first array elements");
        for (int i = 0;i < 2; i++){
            for (int j = 0; j<2; j++){
                arrayOne[i][j] = sc.nextInt();
            }
        }
        System.out.println("second array elements");
        for (int i = 0;i < 2; i++){
            for (int j = 0; j<2; j++){
                arrayTwo[i][j] = sc.nextInt();
            }
        }

// Performing Sum Of Array
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                sumArray[i][j] = arrayOne[i][j] + arrayTwo[i][j];
            }
        }

// First Array print
        System.out.println("FIRST ARRAY");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.print(arrayOne[i][j]+" ");
            }
            System.out.println();
        }

// First Array print
        System.out.println("SECOND ARRAY");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.print(arrayTwo[i][j]+" ");
            }
            System.out.println();
        }

// Print Sum of arrays
        System.out.println("SUM OF ARRAY");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
