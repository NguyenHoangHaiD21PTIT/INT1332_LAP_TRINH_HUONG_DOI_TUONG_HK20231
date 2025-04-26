package KIEM_TRA_26_04;
import java.util.*;
import java.io.*;
class GiangVien{
    private static int sMa = 1;
    private String ma, hoTen;
    private double hsLuong, luong;
    public GiangVien(String hoTen, double hsLuong) {
        this.hoTen = hoTen;
        this.hsLuong = hsLuong;
        this.ma = String.format("PM%03d", sMa++);
        this.luong = (double)this.hsLuong * 300000.0;
    }
    public String toString(){
        return ma + " " + hoTen + " " + hsLuong + " " + Math.round(this.luong);
    }
}

public class KT2_B02_TINH_LUONG_GIANG_VIEN_DON_GIAN{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<GiangVien> a=new ArrayList<>();
        int n=Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new GiangVien(in.nextLine(), 
            Double.parseDouble(in.nextLine())));
        }
        a.forEach(gv->System.out.println(gv));
    }
}
/*

*/
