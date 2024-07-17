public class PatternsOther {
    public static void main(String[] args) {
        int n = 10;


//        + pattern
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n; j++) {
//                if (j == 5 || i ==  5) {
//                    System.out.print(" *");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || i ==  n || j == n || i == 0 || i == j || i == 5 || j == 5 || i == n-j) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
