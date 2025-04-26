package KIEM_TRA_26_04;
import java.util.*;
import java.io.*;
class DuAn{
    private static int sMa = 1;
    private String ma, tenDuAn;
    private double tongChiPhi, tien;
    public DuAn(String tenDuAn, double tongChiPhi) {
        this.tenDuAn = tenDuAn;
        this.tongChiPhi = tongChiPhi;
        this.ma = String.format("CNTT%03d", sMa++);
        this.tien = this.tongChiPhi * 0.3;
    }
    public String toString(){
        return ma + " " + tenDuAn + " " + Math.round(tongChiPhi) + " " + Math.round(tien);
    }
}

public class KT2_B04_DANH_SACH_DU_AN_DON_GIAN{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<DuAn> a=new ArrayList<>();
        int n=Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new DuAn(in.nextLine(), 
            Double.parseDouble(in.nextLine())));
        }
        a.forEach(da->System.out.println(da));
    }
}
/*
2
Game LOL
120000
Web ban do
220000
*/
