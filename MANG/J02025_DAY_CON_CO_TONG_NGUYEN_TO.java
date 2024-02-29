import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class J02025_DAY_CON_CO_TONG_NGUYEN_TO {
    static int ok;
    public static boolean prime(int n){
        if(n<=1) return false;
        for(int i = 2;i<=(int)Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    public static void kt(int b[], int n){
        for(int i = 0; i < n; i++) b[i] = 0;
    }
    public static void gen(int b[], int n){
        int i = n - 1;
        while(i >= 0 && b[i] == 1){
            b[i] = 0;
            i--;
        }
        if(i == -1) ok = 0;
        else b[i] = 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Integer []a = new Integer[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a, new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
                    if (a > b) return -1;
                    else return 1;
                }      
            });
            int []b = new int[n];
            kt(b, n);
            ok = 1;
            while(ok == 1){
                int tong = 0;
                for(int i = 0; i < n; i++){
                    if(b[i] == 1) tong += a[i];
                }
                if(prime(tong)==true){
                    for(int i = 0; i < n; i++){
                        if(b[i] == 1) System.out.print(a[i] + " ");
                    }
                    System.out.println(); 
                } 
                gen(b, n);
            }
        }
    }    
}
