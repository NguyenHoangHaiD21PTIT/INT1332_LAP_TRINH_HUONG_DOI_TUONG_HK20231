/*import java.util.*;
import java.io.*;
class Matrix{
    public int n, m; 
    public int [][]a;
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++) this.a[i][j] = sc.nextInt();
        }
    }
    public Matrix mul(Matrix p){
        Matrix res = new Matrix(this.n,p.m);
        for(int i=0; i<this.n; i++)
            for(int j=0; j<p.m; j++){
                for(int k=0; k<this.m; k++) res.a[i][j] += this.a[i][k]*p.a[k][j];
            }
        return res;
    }
    public String toString(){
        String s = "";
        for(int i = 0;i<this.n;i++){
            for(int j = 0;j<this.m;j++) s += a[i][j]+"" + " ";
            s+="\n";
        }
        return s;
    }
}
public class J04016_TICH_HAI_DOI_TUONG_MA_TRAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}*/
