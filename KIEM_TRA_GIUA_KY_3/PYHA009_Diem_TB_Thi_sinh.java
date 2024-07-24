package KIEM_TRA_GIUA_KY_3;
import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {
    public String hoTen, ngaySinh;
    public double mon1, mon2, mon3, monMin, tb;
    public ThiSinh(String hoTen, String ngaySinh, double mon1, double mon2, double mon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        double monMin = Math.min(mon1, Math.min(mon2, mon3));
        this.tb = (monMin * 2 + (mon1 + mon2 + mon3 - monMin)) / 4;
    }
    @Override
    public int compareTo(ThiSinh o) {
        return Double.compare(o.tb, this.tb);
    }
    @Override
    public String toString() {
        return hoTen + " " + ngaySinh + " " + String.format("%.1f", tb);
    }
}

public class PYHA009_Diem_TB_Thi_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> dsThiSinh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double mon1 = Double.parseDouble(sc.nextLine());
            double mon2 = Double.parseDouble(sc.nextLine());
            double mon3 = Double.parseDouble(sc.nextLine());
            dsThiSinh.add(new ThiSinh(hoTen, ngaySinh, mon1, mon2, mon3));
        }
        Collections.sort(dsThiSinh);
        for (ThiSinh thiSinh : dsThiSinh) System.out.println(thiSinh);
    }
}
/*
2
Tran Van Nam
06/07/2002
4.5
7.9
5.4
Nguyen Hoang Ha
11/10/2001
4.5
10.0
5.5
*/