import java.util.*;
public class XU_LY_ANH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
            int[][] a = new int[n + 1][m + 1];
            int[][] prefix = new int[n + 1][m + 1];         
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) a[i][j] = sc.nextInt();
            }
            // Xây dựng mảng cộng dồn
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + a[i][j];
                }
            }
            
            for (int i = 1; i <= n - l + 1; i++) {
                for (int j = 1; j <= m - l + 1; j++) {
                    // Tính tổng cộng dồn trên HCN với hàng [i; i + l - 1] và [j; j + l - 1]
                    int k = (prefix[i + l - 1][j + l - 1] - prefix[i - 1][j + l - 1] - prefix[i + l - 1][j - 1] + prefix[i - 1][j - 1]) / (l * l);
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}
