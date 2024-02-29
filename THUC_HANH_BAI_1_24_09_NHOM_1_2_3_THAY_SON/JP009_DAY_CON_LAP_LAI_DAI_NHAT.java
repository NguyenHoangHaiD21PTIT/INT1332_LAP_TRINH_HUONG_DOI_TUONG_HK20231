import java.util.*;
public class JP009_DAY_CON_LAP_LAI_DAI_NHAT{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            int [][]dp = new int[105][105];
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int ans = 0;
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    if(s.charAt(i - 1) == s.charAt(j - 1)  && i !=j){
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j-1]);
                    }
                    ans = Math.max(ans, dp[i][j]);
                }
            }
            System.out.println(ans);
        }
    }
}
