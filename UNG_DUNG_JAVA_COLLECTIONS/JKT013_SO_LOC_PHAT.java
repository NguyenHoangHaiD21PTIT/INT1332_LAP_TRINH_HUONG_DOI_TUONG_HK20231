import java.util.*;
public class JKT013_SO_LOC_PHAT {
    //Sinh nhị phân ngược
    static int ok;
    public static void kt(int a[], int n){
        for(int i = 0;i<n;i++) a[i] = 8;
    }
    //Gặp 0 thành 1 cho đến khi gặp con 1 đầu tiên thì thành 0 
    public static void sinh(int a[], int n){
        int i = n - 1;
        while (i>=0 && a[i]==6){
            a[i] = 8;
            i--;
        }
        if(i==-1) ok = 0;
        else a[i] = 6;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int tong = 0;
            for(int i = 1;i<=n;i++) tong+=Math.pow(2, i);
            System.out.println(tong);
            while(n>0){
                int []a = new int[n];
                kt(a, n);
                ok = 1;
                while(ok==1){
                    for(int i = 0;i<n;i++) System.out.print(a[i]);
                    System.out.print(" ");
                    sinh(a, n);
                }
                n--;
            }
            System.out.println();
        }
    }
}
