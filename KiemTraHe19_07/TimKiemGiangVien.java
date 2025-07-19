package KiemTraHe19_07;
import java.util.*;
class GiangVien {
    private String ma, hoTen;
    private double heSoLuong;
    private char heSoKhuyenKhich;
    private int gioNCKH;
    private double luong;
    public GiangVien(int x, String hoTen, double heSoLuong, char heSoKhuyenKhich, int gioNCKH) {
        this.ma = "PM" + String.format("%03d", x + 1);
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
        this.heSoKhuyenKhich = heSoKhuyenKhich;
        double heSo = 0.0;
        if(heSoKhuyenKhich == 'A') heSo = 1.5;
        else if (heSoKhuyenKhich == 'B') heSo = 1.2;
        else heSo = 1.0;
        this.gioNCKH = gioNCKH;
        luong = heSoLuong * heSo * 3000;
        if (gioNCKH <= 100) luong *= 0.85;
        else if (gioNCKH <= 350) luong *= 0.90;
        else if (gioNCKH <= 499) luong *= 0.95;
        luong = Math.round(luong);
    }
    public boolean containsName(String s) {
        return hoTen.toLowerCase().contains(s.toLowerCase());
    }
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + heSoLuong + " " + heSoKhuyenKhich + " " + gioNCKH + " " + String.format("%.0f", luong);
    }
}

public class TimKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<GiangVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            double heSoLuong = Double.parseDouble(sc.nextLine());
            char kk = sc.nextLine().charAt(0);
            int gio = Integer.parseInt(sc.nextLine());
            list.add(new GiangVien(i, hoTen, heSoLuong, kk, gio));
        }
        String key = sc.nextLine();
        for (GiangVien gv : list) {
            if (gv.containsName(key)) System.out.println(gv);
        }
    }
}
/*
3
To An An
4.2
B
300
Tran Van Tuan
3.5
C
800
Vu Thi Teo
3
B
700
an
*/
