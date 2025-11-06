package KY_DONG_2025_05_11_CO_VAN_ANH;
import java.util.*;
class NguoiCong {
    private String ma, hoVaten;
    private int namSinh;
    private double hsl;
    private String dienThoai;
    private static int sma = 0;
    public NguoiCong() {
        sma++;
        this.ma = String.format("E%03d", sma);
    }
    public void input(Scanner in) {
        this.hoVaten = in.nextLine();
        this.namSinh = Integer.parseInt(in.nextLine());
        this.hsl = Double.parseDouble(in.nextLine());
        this.dienThoai = in.nextLine();
    }
    public String getMa() {
        return ma;
    }
    public int getTuoi() {
        return 2024 - namSinh; 
    }
    @Override
    public String toString() {
        double luong = hsl * 10000;
        return ma + " " + hoVaten + " " + getTuoi() + " " + dienThoai + " " + luong;
    }
}
class QLNC {
    private NguoiCong[] a;
    public QLNC(NguoiCong[] a) {
        this.a = a;
    }
    public void out() {
        for (NguoiCong nc: a) System.out.println(nc.toString());
    }
}
public class KT1_005_QUAN_LY_NGUOI_CONG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        NguoiCong[] nn=new NguoiCong[n];
        for (int i = 0; i < n; i++) {
            nn[i] = new NguoiCong();
            nn[i].input(in);
        }
        QLNC q=new QLNC(nn);
        q.out();
    }
}
/*
2
To an An
1996
4.5
0912785655
Vu Thi Hanh
2001
6.0
0913231165
*/
