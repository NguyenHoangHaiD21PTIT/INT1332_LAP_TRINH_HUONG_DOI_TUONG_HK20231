import java.util.*;
import java.io.*;
class Phan_So{
    private long tu, mau;
    public static long UCLN(long a, long b){
        while(b!=0){
            long tmp = a %b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public Phan_So(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public void rutgon(){
        long tmp1 = this.tu, tmp2 = this.mau;
        this.tu = this.tu/UCLN(tmp1, tmp2);
        this.mau = this.mau/UCLN(tmp1, tmp2);
    }
    public Phan_So tich(Phan_So b){
        long y = this.mau * b.mau;
        long x = this.tu * b.tu;
        Phan_So res = new Phan_So(x, y);
        res.rutgon();
        return res;
    }
    public long gettu(){
        return this.tu;
    }
    public long getmau(){
        return this.mau;
    }
}
public class KT1_12_TICH_HAI_PHAN_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), y = sc.nextLong(), z = sc.nextLong(), t = sc.nextLong();
        Phan_So a = new Phan_So(x, y);
        Phan_So b = new Phan_So(z, t);
        Phan_So c = a.tich(b);
        c.rutgon();
        if(c.gettu()%c.getmau()==0) System.out.println(c.gettu()/c.getmau());
        else System.out.println(c.gettu() + "/" + c.getmau());
    }
}
