package KIEM_TRA_D22N06_BAI1;
import java.util.*;
public class CHIA_VA_SAP_XEP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int []a = new int[n];
            for(int i = 0;i<n;i++) a[i] = sc.nextInt();
            ArrayList<Integer>x1 = new ArrayList<>(), x2 = new ArrayList<>();
            for(int i = 0;i<=m - 1;i++) x1.add(a[i]);
            x1.add(k);
            for(int i = m;i<n;i++) x2.add(a[i]);
            Collections.sort(x1);
            Collections.sort(x2, Collections.reverseOrder());
            for(int x: x1) System.out.print(x + " ");
            for(int x: x2) System.out.print(x + " ");
            System.out.println();
        }
    }
}

