import java.io.*;
import java.util.*;

public class J07076_SAP_XEP_MA_TRAN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MATRIX.in")); 
        int t = sc.nextInt();
        while (t-- > 0) {
            int hang = sc.nextInt(), cot = sc.nextInt(), k = sc.nextInt();
            int[][] a = new int[hang][cot];
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < hang; i++) {
                for (int j = i; j < hang; j++) {
                    if (a[i][k - 1] > a[j][k - 1]) {
                        int temp = a[i][k - 1];
                        a[i][k - 1] = a[j][k - 1];
                        a[j][k - 1] = temp;
                    }
                }
            }
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}







