package KIEM_TRA_04_11_CA_16H_CO_VAN_ANH;
import java.util.*;
import java.io.*;
class TuLieu {
    protected String ma, tenNhaXB;
    protected double gia;
    protected int soLuong;
    private static int cnt = 1;
    public TuLieu(String tenNhaXB, double gia, int soLuong) {
        this.tenNhaXB = tenNhaXB;
        this.gia = gia;
        this.soLuong = soLuong;
        this.ma = String.format("%03d", cnt);
        cnt++;
    }
}
class Bao extends TuLieu{
    private String ngay, tenBao;
    private double tongTien;
    public Bao(String tenBao, String tenNhaXB, String ngay, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ngay = ngay;
        this.tenBao = tenBao;
        this.ma = Character.toUpperCase(this.tenBao.charAt(0)) + this.ma;
        int thang = Integer.parseInt(this.ngay.substring(3, 5));
        if(thang==1||thang==2) this.gia = this.gia * 95.0/100.0;
        this.tongTien = this.gia * this.soLuong;
        if(this.soLuong > 200) this.tongTien = this.tongTien * 95.0/100.0;
    }
    public String toString(){
        return this.ma + " " + this.tenBao + " " + this.ngay + " " + this.tenNhaXB + " " + String.format("%.0f", this.gia);
    }
}
class SachHoc extends TuLieu{
    private String tenSach, tenTG;
    private int soTrang;
    private double tongTien;
    public SachHoc(String tenSach, String tenTG, int soTrang, String tenNhaXB, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
        String []tmp = this.tenSach.trim().split("\\s+");
        this.ma = tmp[0].toUpperCase() + this.ma;
        if(this.soTrang>=0 && this.soTrang<=300){
            this.gia = this.gia * 95.0/100.0;
        } else if (this.soTrang>=301 && this.soTrang<=500){
            this.gia = this.gia * 90.0/100.0;
        } else {
            this.gia = this.gia * 85.0/100.0;
        }
        this.tongTien = this.soLuong * this.gia;
        if(this.soLuong > 500) this.tongTien = this.tongTien * 90.0/100.0;
    }
    public String toString(){
        return this.ma + " " + this.tenSach + " " + this.tenNhaXB + " " + this.soTrang + " " + String.format("%.0f", this.gia);
    }
}
class QuanLyTuLieu{
    private SachHoc t1;
    private Bao t2;
    public void nhapBao(Scanner sc){
        t2 = new Bao(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
    }
    public void nhapSachHoc(Scanner sc){
        t1 = new SachHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
    }
    public void out(){
        System.out.println(t2);
        System.out.println(t1);
    }
}
public class KT2_LOPD_CAU_2_BAI_TOAN_QUAN_LY_TU_LIEU_NHAP_VA_VIET_RA {
    public static void main(String[] args) {
        QuanLyTuLieu q=new QuanLyTuLieu();
        Scanner in=new Scanner(System.in);
        q.nhapBao(in);
        q.nhapSachHoc(in);
        q.out();
    }
}
