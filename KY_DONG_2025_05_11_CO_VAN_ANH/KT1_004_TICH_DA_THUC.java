package KY_DONG_2025_05_11_CO_VAN_ANH;
import java.util.*;
class DaThuc{
    private int n;
    private double []a;
    public DaThuc(){
        this.n = 0;
        this.a = new double[1];
        this.a[0] = 0;
    }
    public DaThuc(double []a){
        this.a = a;
        this.n = a.length - 1;
    }
    public int getBac(){
        return n;
    }
    public double[] getA(){
        return a;
    }
    public void input(Scanner sc){
        this.n = sc.nextInt();
        this.a = new double[this.n + 1];
        for(int i = 0; i <= this.n; i++) this.a[i] = sc.nextDouble();
    }
    public void out(){
        String ans = "";
        for(int i = 0; i <= this.n; i++){
            if (i > 0) ans += " + ";
            ans += String.format("%.1f", a[i]) + " * X^" + String.format("%d", i);
        }
        System.out.println(ans);
    }
    public DaThuc nhan(DaThuc b){
        int mx = this.n + b.getBac();
        double []res = new double[mx + 1];
        for(int k = 0; k <= mx; k++) res[k] = 0;
        for(int i = 0; i <= this.n; i++){
            for(int j = 0; j <= b.getBac(); j++) res[i + j] += this.a[i] * b.getA()[j];
        }
        return new DaThuc(res);
    }
}
public class KT1_004_TICH_DA_THUC {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x[] = {1, 1, 1};
        DaThuc a = new DaThuc();
        a.input(in);
        a.out();
        DaThuc d = new DaThuc(x);
        DaThuc c = d.nhan(a);
        c.out();
    }
}
/*
2
1 1 1
*/
