import java.util.Scanner;
public class J03031_XAU_DAY_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.next();
            int k = sc.nextInt();
            sc.nextLine();
            int []cnt = new int[300];
            for(int i = 0;i<s.length();i++){
                cnt[s.charAt(i) - '0'] = 1;
            }
            int ans = 0;
            for(int i = 0;i<s.length();i++){
                if (cnt[s.charAt(i) - '0'] == 1){
                    ans++;
                    cnt[s.charAt(i) - '0'] =0;
                }
            }
            if (26 - ans <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
