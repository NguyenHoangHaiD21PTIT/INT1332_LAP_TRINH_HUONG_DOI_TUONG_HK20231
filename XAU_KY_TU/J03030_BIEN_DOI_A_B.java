import java.util.*;
public class J03030_BIEN_DOI_A_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = " " + s;  
        int n = s.length();
        long[] a = new long[n + 5];
        long[] b = new long[n + 5];
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'A') {
                a[i] = a[i - 1];
                b[i] = Math.min(b[i - 1] + 1, a[i - 1] + 1);
            } else {
                b[i] = b[i - 1];
                a[i] = Math.min(a[i - 1] + 1, b[i - 1] + 1);
            }
        }
        System.out.println(a[n - 1]);
    }
}
