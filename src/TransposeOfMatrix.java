import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] originalArray = new int[3][3];
        int[][] transposeArray = new int[3][3];

        for(int i = 0; i<3;i++){
            for(int j = 0; j<3; j++){
                originalArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                transposeArray[i][j] = originalArray[j][i];
            }
        }
        System.out.println("ORIGINAL ARRAY -");
        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(originalArray[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("TRANSPOSED ARRAY -");
        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(transposeArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
