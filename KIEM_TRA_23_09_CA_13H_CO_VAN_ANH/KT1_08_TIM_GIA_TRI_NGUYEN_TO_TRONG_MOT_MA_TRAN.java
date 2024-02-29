import java.util.*;
import java.io.*;

public class KT1_08_TIM_GIA_TRI_NGUYEN_TO_TRONG_MOT_MA_TRAN {
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
            LinkedHashSet<Integer>st = new LinkedHashSet<>();
            for(int i = 0;i<hang;i++){
                for(int j = 0;j<cot;j++){
                    a[i][j] = sc.nextInt();
                    if(check(a[i][j])==1) st.add(a[i][j]);
                }
            }
            System.out.println("Test " + tmp + ":");
            for(int x: st) System.out.print(x + " ");
            System.out.println();
        }
    }
}
