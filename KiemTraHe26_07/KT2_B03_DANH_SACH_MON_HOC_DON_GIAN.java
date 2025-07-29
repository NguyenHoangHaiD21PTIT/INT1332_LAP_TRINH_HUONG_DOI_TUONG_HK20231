package KiemTraHe26_07;
import java.util.*;
class MonHoc {
    private static int sMa = 1;
    private String ma, tenMon;
    private int soTinChi;
    public MonHoc(String tenMon, int soTinChi) {
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
        this.ma = String.format("INT%03d", sMa++);
    }
    public long getTienNop() {
        return soTinChi * 860L;
    }
    @Override
    public String toString() {
        return ma + " " + tenMon + " " + soTinChi + " " + getTienNop();
    }
}
public class KT2_B03_DANH_SACH_MON_HOC_DON_GIAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <MonHoc> a = new ArrayList <> ();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new MonHoc(in.nextLine(), 
            Integer.parseInt(in.nextLine())));
        }
        a.forEach(mh->System.out.println(mh));
    }
}
/*
2
Lap trinh HDT
3
Co so du lieu
2
*/
