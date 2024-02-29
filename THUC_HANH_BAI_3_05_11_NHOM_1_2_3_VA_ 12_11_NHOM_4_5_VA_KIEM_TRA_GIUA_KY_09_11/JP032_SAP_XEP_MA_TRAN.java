/*package THUC_HANH_BAI_3_05_11_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
class Matrix {
    private int n, m;
    private int[][] a;
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void setA(int[][] a) {
        this.a = a;
    }
    public void sapXep(int k) {
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(this.a[i][k - 1] > this.a[j][k - 1]){ 
                    int tmp = this.a[i][k - 1];
                    this.a[i][k - 1] = this.a[j][k - 1];
                    this.a[j][k - 1] = tmp;
                }
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)  sb.append(a[i][j]).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class JP032_SAP_XEP_MA_TRAN {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
            }
            Matrix b = new Matrix(n, m);
            b.setA(a);
            b.sapXep(k);
            System.out.print(b);
        }
    }
}*/
