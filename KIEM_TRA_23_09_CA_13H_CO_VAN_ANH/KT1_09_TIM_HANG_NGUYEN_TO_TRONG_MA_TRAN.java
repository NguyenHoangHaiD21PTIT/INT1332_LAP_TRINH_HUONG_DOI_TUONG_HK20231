import java.util.*;
public class KT1_09_TIM_HANG_NGUYEN_TO_TRONG_MA_TRAN {
    public static int check(int n){
        if(n<=1) return 0;
        for(int i = 2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int tmp = 1;tmp<=t;tmp++){
            int hang = sc.nextInt(), cot = sc.nextInt();
            int [][]a = new int[hang][cot];
            for(int i = 0;i<hang;i++){
                for(int j = 0;j<cot;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + tmp + ":");
            for(int i = 0;i<hang;i++){
                int check = 1;
                for(int j = 0;j<cot;j++){
                    if(check(a[i][j])==0){
                        check = 0;
                        break;
                    }
                }
                if(check==1) System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
