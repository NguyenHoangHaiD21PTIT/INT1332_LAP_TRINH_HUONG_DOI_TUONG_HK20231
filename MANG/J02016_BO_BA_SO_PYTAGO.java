import java.util.*;
public class J02016_BO_BA_SO_PYTAGO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            List<Long> v = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                v.add(a[i] * a[i]);
            }
            Collections.sort(v);
            boolean check = false;
            for (int i = (int) n - 1; i >= 2; i--) {
                boolean check1 = false;  
                int l = 0, r = i - 1;
                while (l < r) {
                    if (v.get(l) + v.get(r) == v.get(i)) {
                        check1 = true;
                        break;
                    }
                    if (v.get(l) + v.get(r) < v.get(i)) l++;
                    if (v.get(l) + v.get(r) > v.get(i)) r--;
                }
                if (check1) {
                    check = true;
                    break;
                }
            }

            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
