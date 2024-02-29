import java.util.Scanner;
public class J02022_SO_XA_CACH {
    //Sinh hoán vị
    static int ok;
    public static void kt(int a[], int n){
        for (int i = 1;i<=n;i++) a[i] = i;
    }
    public static void sinh(int a[], int n){
        //Bước 1: Tìm vị trí đầu tiên từ cuối laị mà tại đó nó nhỏ hơn số đằng sau nó
        int i = n - 1;
        while(i>=1 && a[i] > a[i + 1]) i--;
        //Bước 2: Check vị trí
        if (i==0){
            ok = 0;
        } else {
            //Bước 3: Tìm vị trí đầu tiên từ cuối lại lớn hơn a[i] và hoán vị
            int j = n;
            while(a[i]>a[j]) j--;
            //Hoán vị
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            //Bước 4: Lật ngược mảng từ i + 1 về cuối
            int l = i + 1, r = n;
            while(l<r){
                int tam = a[l];
                a[l] = a[r];
                a[r] = tam;
                l++; r--;
            }
        }
    }
    public static int check(int a[], int n){
        for (int i = 1;i<=n - 1;i++){
            if(Math.abs(a[i] - a[i + 1]) == 1) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int []a = new int[n + 2];
            kt(a, n);
            ok = 1;
            while(ok==1){
                if(check(a, n)==1){
                    for(int i = 1;i<=n;i++) System.out.print(a[i]);
                    System.out.println();
                }
                sinh(a, n);
            }
            System.out.println();
        }
    }
}
