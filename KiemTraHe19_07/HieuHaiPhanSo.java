package KiemTraHe19_07;
import java.util.Scanner;
class PhanSo {
    private long tu, mau;
    public PhanSo() {
    }
    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void input(Scanner sc) {
        this.tu = sc.nextLong();
        this.mau = sc.nextLong();
    }
    public static long UCLN(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long res = a % b;
            a = b;
            b = res;
        }
        return a;
    }
    private void rutGon() {
        if (mau < 0) { // Đưa dấu về tử
            mau = mau * (-1);
            tu = tu * (-1);
        }
        long g = UCLN(tu, mau);
        tu /= g;
        mau /= g;
    }
    public PhanSo hieu(PhanSo other) {
        long tuMoi = this.tu * other.mau - other.tu * this.mau;
        long mauMoi = this.mau * other.mau;
        long gcd = UCLN(tuMoi, mauMoi);
        tuMoi /= gcd;
        mauMoi /= gcd;
        PhanSo a = new PhanSo(tuMoi, mauMoi);
        return a;
    }
    public void out() {
        if (tu == 0) System.out.println("0");
        else if (mau == 1) System.out.println(tu);
        else System.out.println(tu + "/" + mau);
    }
}
public class HieuHaiPhanSo {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        Scanner in = new Scanner(System.in);
        a.input(in);   
        b.input(in);
        PhanSo c = a.hieu(b); 
        c.out();
    }
}
/*
123 456 12 34
3 4 3 4
-1 4 1 10 */

