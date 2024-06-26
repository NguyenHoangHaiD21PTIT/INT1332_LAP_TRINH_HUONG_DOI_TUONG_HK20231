package MANG;
import java.util.*;
public class J02034_BO_SUNG_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] cnt = new boolean[250];
        int Max = -1;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            cnt[x] = true;
            Max = Math.max(Max, x);
        }
        
        boolean check = true;
        for (int i = 1; i <= Max; i++) {
            if (!cnt[i]) {
                System.out.println(i);
                check = false;
            }
        } 
        if (check) System.out.println("Excellent");
    }
}
