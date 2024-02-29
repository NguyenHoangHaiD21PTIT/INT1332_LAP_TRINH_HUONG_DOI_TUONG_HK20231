import java.util.Scanner;
public class J01005_CHIA_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), h = sc.nextInt();
            for (int i = 1; i <= n - 1; i++) {
                double res = h * 1.0 * Math.sqrt(i * 1.0 / n);
                System.out.printf("%.6f ", res);
            }
            System.out.println();
        }
    }
}
