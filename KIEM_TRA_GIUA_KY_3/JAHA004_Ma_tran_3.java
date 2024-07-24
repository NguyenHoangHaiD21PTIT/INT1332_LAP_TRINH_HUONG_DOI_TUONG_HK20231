package KIEM_TRA_GIUA_KY_3;
import java.util.Scanner;
public class JAHA004_Ma_tran_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        }
        int k = sc.nextInt();
        int tongtren = 0;
        int tongduoi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) tongtren += a[i][j];
                else if (i > j) tongduoi += a[i][j];
            }
        }
        double result = Math.sqrt(Math.abs(tongtren - tongduoi));
        if (result <= k) System.out.println("YES");
        else System.out.println("NO");
        System.out.printf("%.5f%n", result);
    }
}
