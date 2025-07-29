package KiemTraHe26_07;
import java.util.*;
abstract class SanPham {
    protected String ma, ten;
    protected double gia;
    public SanPham() {
    }
    public abstract void nhap(Scanner in);
    public abstract double getGia();
    public abstract String toString();
}
class SanPhamGo extends SanPham {
    private String loaiGo, xuatXu;
    private static int sMa = 1;
    public SanPhamGo() {
        this.ma = String.format("G%02d", sMa++);
    }
    @Override
    public void nhap(Scanner in) {
        ten = in.nextLine();
        loaiGo = in.nextLine();
        xuatXu = in.nextLine();
        gia = Double.parseDouble(in.nextLine());
    }
    @Override
    public double getGia() {
        if (!xuatXu.equalsIgnoreCase("VN")) return gia * 1.1;
        return gia;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + loaiGo + " " + xuatXu + " " + Math.round(getGia());
    }
}
class SanPhamNhua extends SanPham {
    private String loaiNhua;
    private boolean taiChe;
    private static int sMa = 1;
    public SanPhamNhua() {
        this.ma = String.format("N%02d", sMa++);
    }
    @Override
    public void nhap(Scanner in) {
        ten = in.nextLine();
        loaiNhua = in.nextLine();
        taiChe = Boolean.parseBoolean(in.nextLine());
        gia = Double.parseDouble(in.nextLine());
    }
    @Override
    public double getGia() {
        if (taiChe) return gia * 0.85;
        return gia;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + loaiNhua + " " + (taiChe ? "tai che" : "khong") + " " + Math.round(getGia());
    }
}

public class D22VLVH_01_TAO_LOP_CHA_VA_CON_SAN_PHAM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SanPham sp = new SanPhamNhua();
        ((SanPhamNhua) sp).nhap(in);
        System.out.println(sp);
        sp = new SanPhamGo();
        ((SanPhamGo) sp).nhap(in);
        System.out.println(sp);
    }
}
/*
Ghe nhua
nhua pp
true
23000
ban go
go soi
jp
120000
*/
