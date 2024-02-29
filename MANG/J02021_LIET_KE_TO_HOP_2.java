import java.util.Scanner;
public class J02021_LIET_KE_TO_HOP_2 {
    static int ok;
    public static void kt(int a[], int n, int k) {
        for (int i = 1; i <= k; i++) a[i] = i;
    }
    public static void sinh(int a[], int n, int k) {
        int i = k;
        while (i >= 1 && a[i] == n - k + i) i--;
        if (i == 0) {
            ok = 0;
        } else {
            a[i]++;
            for (int j = i + 1; j <= k; j++) a[j] = a[j - 1] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int []a = new int[n];
        kt(a, n, k);
        ok = 1;
        int cnt = 0;
        while (ok == 1) {
            for (int i = 1; i <= k; i++) System.out.print(a[i]);
            System.out.print(" ");
            cnt++;
            sinh(a, n, k);
        }
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}