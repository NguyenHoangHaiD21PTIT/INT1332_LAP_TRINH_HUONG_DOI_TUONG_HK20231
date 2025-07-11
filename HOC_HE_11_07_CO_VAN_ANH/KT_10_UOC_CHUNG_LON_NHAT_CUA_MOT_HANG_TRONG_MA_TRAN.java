package HOC_HE_11_07_CO_VAN_ANH;
import java.util.*;
public class KT_10_UOC_CHUNG_LON_NHAT_CUA_MOT_HANG_TRONG_MA_TRAN {
    public static int ucln(int a, int b){
        int res = 0;
        while(b!=0){
           res = a%b;
           a = b;
           b = res;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int hang = sc.nextInt(), cot = sc.nextInt();
            int [][]a = new int[hang][cot];
            for(int i = 0;i<hang;i++){
                for(int j= 0;j<cot;j++) a[i][j] = sc.nextInt();
            }
            for(int i = 0;i<hang;i++){
                int res = a[i][0];
                for(int j = 1;j<cot;j++) res = ucln(res, a[i][j]);
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
