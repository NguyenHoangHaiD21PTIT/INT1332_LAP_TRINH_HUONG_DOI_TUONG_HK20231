package MANG;
import java.util.*;
/* TIM CAP SO CO DO CHENH LECH <K .
SX. Xet cac so sau a[i]: x sao cho x - a[i] <k --> x <= k + a[i]- 1 
--> Tim vi tri dau tien > k + a[i] - 1 --> upperbound --> Lui pos di 1
--> Cac so thoa man [i+1;pos-1] */
public class J02027_KHOANG_CACH_NHO_HON_K {
    public static int upper_bound(int l, int r, int[] a, int x) {
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            if (a[mid] <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];      
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int ans = 0;      
            for (int i = 0; i < n - 1; i++) {
                int pos = upper_bound(i + 1, n, a, k + a[i] - 1);
                int socap = (pos - 1) - (i + 1) + 1;
                ans += socap;
            }       
            System.out.println(ans);
        }
    }
}
