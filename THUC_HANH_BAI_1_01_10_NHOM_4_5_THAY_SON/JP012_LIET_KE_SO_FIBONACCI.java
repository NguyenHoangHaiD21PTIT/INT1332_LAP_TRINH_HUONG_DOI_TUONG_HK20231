import java.util.*;
public class JP012_LIET_KE_SO_FIBONACCI {
    public static long[] f = new long[94]; 
    public static void fibo() {
        f[1] = 1; f[2] = 1;
        for (int i = 3; i <= 93; i++) f[i] = f[i - 1] + f[i - 2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fibo();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            for (int i = a; i <= b; i++) System.out.print(f[i] + " ");
            System.out.println();
        }
    }
}
