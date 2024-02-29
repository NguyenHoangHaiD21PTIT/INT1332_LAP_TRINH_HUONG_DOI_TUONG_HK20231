import java.util.Scanner;
public class J02008_BOI_SO_NHO_NHAT_CUA_N_SO_NGUYEN_DUONG_DAU_TIEN {
    public static long BCNN(long a, long b){
        long res = a * b;
        while(b!=0){
            long c = a % b;
            a = b;
            b = c;
        }
        return res/a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long res = 1;
            for(long i = 1;i<=n;i++) res = BCNN(res, i);
            System.out.println(res);
        } 
    }   
}
