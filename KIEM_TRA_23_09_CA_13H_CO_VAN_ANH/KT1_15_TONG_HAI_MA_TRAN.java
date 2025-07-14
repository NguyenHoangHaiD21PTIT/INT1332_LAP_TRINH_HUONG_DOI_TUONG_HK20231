import java.util.*;
class Matran{
    private int n;
    private int [][]a;
    public Matran(int n){
        this.n = n;
        this.a = new int[n][n];
    }
    public int [][] getMatran(){
        return this.a;
    }
    public void input(Scanner sc){
        for(int i = 0;i<this.n;i++){
            for(int j = 0;j<this.n;j++) this.a[i][j] = sc.nextInt();
        }
    }
    public int getKT(){
        return this.n;
    }
    public void out(){
        for(int i = 0;i<this.n;i++){
            for(int j = 0;j<this.n;j++) System.out.print(this.a[i][j] + " ");
            System.out.println();
        }
    }
    public Matran tong(int [][]b){
        Matran res = new Matran(this.n);
        for(int i = 0;i<this.n;i++){
            for(int j = 0;j<this.n;j++) res.a[i][j] = this.a[i][j] + b[i][j];
        }
        return res;
    }
}
public class KT1_15_TONG_HAI_MA_TRAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhap kich thuoc
        int n = sc.nextInt();
        Matran m = new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b = new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran h = m.tong(b.getMatran());
        //viet ra ma tran tong
        h.out();
    }
}
