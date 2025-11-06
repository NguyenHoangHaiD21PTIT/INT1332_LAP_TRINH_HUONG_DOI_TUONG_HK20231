package KY_DONG_2025_05_11_CO_VAN_ANH;
import java.util.*;
class SanPham{
    private String ma, ten, nhaSX;
    private int soLuong;
    private double gia;
    private static int cnt = 0;
    public SanPham(String ten, int soLuong, double gia, String nhaSX) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.nhaSX = nhaSX;
        this.gia = gia;
        cnt++;
        this.ma = getMa();
    }
    private String getMa(){
        String s1 = nhaSX.toUpperCase();
        String s2 = String.format("%03d", cnt);
        return s1 + "-" + s2;
    }
    private double getThanhTien(){
        double goc = soLuong * gia, giam = 0;
        if (soLuong >= 20) giam = goc * 0.10;
        return goc - giam;
    }
    public String toString(){
        double giaLamTron = Math.round(this.gia * 10.0) / 10.0;
        double thanhTien = Math.round(this.getThanhTien() * 10.0) / 10.0;
        return ma + " " + ten + " " + soLuong + " " + giaLamTron + " " + thanhTien;
    }
}
public class KT1_20_TAO_LOP_SAN_PHAM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String ten;
        String nhaSX;
        int soLuong;
        double gia;
        while(n-->0){
            ten = sc.nextLine();
            nhaSX = sc.nextLine();
            soLuong = Integer.parseInt(sc.nextLine());
            gia = Double.parseDouble(sc.nextLine());
            SanPham p = new SanPham(ten, soLuong, gia, nhaSX);
            System.out.println(p);
        }
    }
}
/*
2
Galaxy A53
samsung
10
100
C21 Plus
nokia
30
100
*/
