package MANG;

import java.util.*;
public class J02028_DAY_CON_LIEN_TIEP_TONG_BANG_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            HashMap<Long, Boolean> mp = new HashMap<>();
            long sum = 0;
            boolean check = false;
            for (int i = 0; i < n; i++) {
                sum += a[i];
                if (sum == k || mp.containsKey(sum - k)) {
                    check = true;
                    System.out.println("YES");
                    break;
                }
                mp.put(sum, true);
            }
            if (!check) System.out.println("NO");
        }
    }
}
