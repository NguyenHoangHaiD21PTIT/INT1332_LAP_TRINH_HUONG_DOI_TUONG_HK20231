package LAP_TRINH_JAVA_CO_BAN;
import java.util.*;
public class J01013_TONG_UOC_SO_1 {
    static int []minPrime = new int [2000005];
    public static void findMinPrime(){
        for (int i = 2; i * i <= 2000000; ++i) {
            if (minPrime[i] == 0){
                for (int j = i * i; j <= 2000000; j += i) {
                    if (minPrime[j] == 0) {
                        minPrime[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= 2000000; ++i) {
            if (minPrime[i] == 0) {
                minPrime[i] = i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findMinPrime();
        int t = sc.nextInt();
        long res = 0;
        while(t-- >0){
            int n = sc.nextInt();
            if(n>=1){
                while(n!=1){
                    res+=minPrime[n];
                    n/=minPrime[n];
                }
            }
        }
        System.out.println(res);
    }
}
