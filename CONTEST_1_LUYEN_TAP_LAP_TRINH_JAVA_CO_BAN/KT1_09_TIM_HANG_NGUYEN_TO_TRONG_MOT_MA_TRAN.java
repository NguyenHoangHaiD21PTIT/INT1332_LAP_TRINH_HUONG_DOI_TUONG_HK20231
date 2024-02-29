package CONTEST_1_LUYEN_TAP_LAP_TRINH_JAVA_CO_BAN;
import java.io.*;
import java.util.Scanner;
public class KT1_09_TIM_HANG_NGUYEN_TO_TRONG_MOT_MA_TRAN {
    public static int checknt(int x){
        if(x<=1) return 0;
        for(int i = 2;i<=(int)Math.sqrt(x);i++){
            if(x%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1;k<=t;k++){
            int hang = sc.nextInt(), cot = sc.nextInt();
            int [][]a = new int[hang][cot];
            for(int i = 0;i<hang;i++){
                for(int j = 0;j<cot;j++) a[i][j] = sc.nextInt();
            }
            System.out.println("Test " + k + ":");
            for(int i = 0;i<hang;i++){
                int check = 1;
                for(int j = 0;j<cot;j++){
                    if(checknt(a[i][j])==0){
                        check = 0;
                        break;
                    }
                }
                if(check == 1) System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
