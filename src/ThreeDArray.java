import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int threeDArray[][][] = new int[3][3][3];
        for (int i = 0; i<3; i++){
            for (int j = 0;j<3;j++){
                for (int k = 0;k<3;k++){
                    threeDArray[i][j][k] = sc.nextInt();
                }
            }
        }


        for (int i = 0; i<3; i++){
            for (int j = 0;j<3;j++){
                for (int k = 0;k<3;k++){
                    System.out.print(threeDArray[i][j][k]+" ");
                }
                System.out.print("   ");
            }
            System.out.println(" ");
        }
        System.out.println();
        for (int i = 0; i<3; i++){
            for (int j = 0;j<3;j++){
                for (int k = 0;k<3;k++){
                    System.out.print(threeDArray[i][j][k]+" ");
                }
                System.out.print("   ");
            }
            System.out.println(" ");
        }
        System.out.println();
        for (int i = 0; i<3; i++){
            for (int j = 0;j<3;j++){
                for (int k = 0;k<3;k++){
                    System.out.print(threeDArray[i][j][k]+" ");
                }
                System.out.print("   ");
            }
            System.out.println(" ");
        }
    }
}
