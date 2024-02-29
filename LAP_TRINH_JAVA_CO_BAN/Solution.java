import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long []f = new long[1000006];
        int MOD = 1000000007;
        f[1] = 1; f[2] = 1;
        for(int i = 3;i<=n;i++){ 
            f[i] = 2 * (f[i - 1]%MOD) + 3 * (f[i - 2]%MOD);
            f[i] %=MOD;
        }
        System.out.println(f[n]);
    }
}