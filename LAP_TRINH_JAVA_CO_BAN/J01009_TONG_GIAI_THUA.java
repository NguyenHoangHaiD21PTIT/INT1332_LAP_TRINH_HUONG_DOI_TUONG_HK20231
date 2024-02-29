import java.util.Scanner;
public class J01009_TONG_GIAI_THUA {
    public static long giaithua(long n){
        long res = 1;
        for(long i = 1;i<=n;i++) res*=i;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        long res = 0;
        for(long i = 1;i<=n;i++) res+=giaithua(i);
        System.out.println(res);
    }  
}