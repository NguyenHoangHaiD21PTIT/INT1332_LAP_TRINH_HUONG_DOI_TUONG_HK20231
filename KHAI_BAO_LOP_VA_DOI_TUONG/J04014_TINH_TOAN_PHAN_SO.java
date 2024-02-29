/*import java.util.*;
class PhanSo {
    public static long UCLN(long a, long b){
        while(b!=0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long BCNN (long a, long b){
        return (a*b)/UCLN(a, b);
    }
    private long tu, mau;
    public PhanSo (long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    @Override
    public String toString(){
        return this.tu + "/" + this.mau;
    }
    public void rutgon(){
        long tmp1 = this.tu, tmp2 = this.mau;
        this.tu = this.tu/UCLN(tmp1, tmp2);
        this.mau = this.mau/UCLN(tmp1, tmp2);
    }
    public PhanSo cong(PhanSo b) {
        this.rutgon();
        b.rutgon();
        long lcm = BCNN(this.mau, b.mau);
        long tu = lcm / this.mau * this.tu + lcm / b.mau * b.tu;
        PhanSo res = new PhanSo(tu, lcm);
        res.rutgon();
        return res;
    }
    public PhanSo nhan(PhanSo b){
        long x = this.tu * b.tu;
        long y = this.mau * b.mau;
        PhanSo res = new PhanSo(x, y);
        return res;
    }
}
public class J04014_TINH_TOAN_PHAN_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- >0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = (a.cong(b)).nhan(a.cong(b));
            c.rutgon();
            PhanSo d = (a.nhan(b)).nhan(c);
            d.rutgon();
            System.out.println(c + " " + d);
        }
    }
}*/
