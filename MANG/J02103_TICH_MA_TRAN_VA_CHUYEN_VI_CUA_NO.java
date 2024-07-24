import java.util.*;
public class J02103_TICH_MA_TRAN_VA_CHUYEN_VI_CUA_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int[][] a = new int[100][100];
            int[][] b = new int[100][100];
            int[][] c = new int[100][100];
            int hang, cot;
            hang = sc.nextInt();
            cot = sc.nextInt();
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) a[i][j] = sc.nextInt(); 
            }
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) b[j][i] = a[i][j];   
            } 
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < hang; j++) {
                    for (int l = 0; l < cot; l++) c[i][j] += a[i][l] * b[l][j];
                }
            }
            System.out.println("Test " + k + ":");
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < hang; j++) System.out.print(c[i][j] + " ");
                System.out.println();
            }
        }
    }
}


