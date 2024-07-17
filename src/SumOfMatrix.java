import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] arrayOne = new int[2][2];
        int[][] arraytwo = new int[2][2];
        int[][] sumArray = new int[2][2];
        System.out.println("first array elemts");
        for (int i = 0;i < 2; i++){
            for (int j = 0; j<2; j++){
                arrayOne[i][j] = sc.nextInt();
            }
        }
        System.out.println("second array elemts");
        for (int i = 0;i < 2; i++){
            for (int j = 0; j<2; j++){
                arraytwo[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                sumArray[i][j] = arrayOne[i][j] + arraytwo[i][j];
            }
        }


        System.out.println("FIRST ARRAY");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.print(arrayOne[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("SECOND ARRAY");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.print(arraytwo[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("SUM OF ARRAY");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }




    }
}
