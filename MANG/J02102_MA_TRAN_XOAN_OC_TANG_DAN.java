import java.util.*;
public class J02102_MA_TRAN_XOAN_OC_TANG_DAN. {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n * n];
        for (int i = 0; i < n * n; i++) v[i] = sc.nextInt();
        Arrays.sort(v);
        int x = 0;
        int[][] a = new int[n][n];
        int cot1 = 0, cot2 = n - 1, hang1 = 0, hang2 = n - 1;
        while (cot1 <= cot2 && hang1 <= hang2) {
            for (int i = cot1; i <= cot2; i++) a[hang1][i] = v[x++];
            hang1++;
            for (int i = hang1; i <= hang2; i++) a[i][cot2] = v[x++];
            cot2--;
            if (hang1 <= hang2) {
                for (int i = cot2; i >= cot1; i--) a[hang2][i] = v[x++];
                hang2--;
            }
            if (cot1 <= cot2) {
                for (int i = hang2; i >= hang1; i--) a[i][cot1] = v[x++];
                cot1++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
