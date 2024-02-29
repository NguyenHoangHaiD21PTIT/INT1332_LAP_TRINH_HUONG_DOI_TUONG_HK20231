package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
public class DSA_P037_XAU_NHI_PHAN_DOI_XUNG_DO_DAI_CHAN {
    static int n, ok;
    static int[] a = new int[100]; 
    public static void kht() {
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
    }
    public static void sinh() {
        int i = n - 1;
        while (i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i == -1) {
            ok = 0;
        } else {
            a[i] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            int n2 = 2;
            while (n2 <= n1) {
                n = n2 / 2;
                kht();
                ok = 1;
                while (ok == 1) {
                    for (int i = 0; i < n; i++) System.out.print(a[i]);
                    for (int i = 0; i < n; i++) System.out.print(a[n - i - 1]);
                    System.out.print(" ");
                    sinh();
                }
                n2 += 2;
            }
            System.out.println();
        }
    }
}
