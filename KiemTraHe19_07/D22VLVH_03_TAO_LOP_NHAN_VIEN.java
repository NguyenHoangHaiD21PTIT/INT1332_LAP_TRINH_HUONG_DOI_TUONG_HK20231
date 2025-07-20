package KiemTraHe19_07;
import java.util.*;
class NhanVien {
    private String ma, hoDem, ten;
    private boolean gioiTinh;
    private int namSinh, sMa = 1;
    public NhanVien() {
        this.ma = "NV" + String.format("%04d", sMa);
    }
    public String getHoTen() {
        return hoDem + " " + ten;
    }
    public void input(Scanner in) {
        this.ma = "NV" + String.format("%04d", sMa++);
        this.hoDem = in.nextLine();
        this.ten = in.nextLine();
        this.gioiTinh = Boolean.parseBoolean(in.nextLine());
        this.namSinh = Integer.parseInt(in.nextLine());
    }
    @Override
    public String toString() {
        String gt = gioiTinh ? "nam" : "nu";
        return ma + " " + getHoTen() + " " + gt + " " + namSinh;
    }
}
public class D22VLVH_03_TAO_LOP_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien nv = new NhanVien();  
        nv.input(in);
        System.out.println(nv.getHoTen());
        System.out.println(nv);
        nv.input(in);  
        System.out.println(nv.getHoTen());
        System.out.println(nv);
    }
}
/*
To Van
An
true
2004
Nguyen Thi
Hoa
false 
2001
*/
