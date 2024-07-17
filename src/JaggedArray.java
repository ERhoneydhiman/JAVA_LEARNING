import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jArray [][] = new int[3][];
        jArray[0] = new int[2];
        jArray[1] = new int[5];
        jArray[2] = new int[3];
        for(int i = 0; i < jArray.length; i++){
            for (int j = 0;j<jArray[i].length;j++){
                jArray[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < jArray.length; i++){
            for (int j = 0;j<jArray[i].length;j++){
                System.out.print(jArray[i][j]+" ");
            }
            System.out.println();
        }

    }
}
