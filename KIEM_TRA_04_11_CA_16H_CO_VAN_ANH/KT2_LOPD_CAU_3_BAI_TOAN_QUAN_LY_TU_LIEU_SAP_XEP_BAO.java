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
    public String getNgay() {
        return ngay;
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
class QuanLyTuLieu {
    private List<TuLieu> list = new ArrayList<>();
    public QuanLyTuLieu() {
    }
    public void setList(List<TuLieu> list) {
        this.list = list;
    }
    ArrayList<Bao>res = new ArrayList<>();
    public void sapxepBaoTheoNgay(int x1) {
        for(TuLieu x: list){ 
            if(x instanceof Bao){
                if(Integer.parseInt(((Bao) x).getNgay().substring(6)) == x1){
                    res.add((Bao) x);
                }
            }
        }
        Collections.sort(res, new Comparator<Bao>(){
            public int compare(Bao a, Bao b){
                int x1 = Integer.parseInt(a.getNgay().substring(0, 2));
                int x2 = Integer.parseInt(a.getNgay().substring(3, 5));
                int y1 = Integer.parseInt(b.getNgay().substring(0, 2));
                int y2 = Integer.parseInt(b.getNgay().substring(3, 5));
                if(x2!=y2) return x2 - y2;
                return x1 - y1;
            }
        });
        for(Bao y: res){
            System.out.println(y);
        }
    }
}
public class KT2_LOPD_CAU_3_BAI_TOAN_QUAN_LY_TU_LIEU_SAP_XEP_BAO {
    public static void main(String[] args) {
        QuanLyTuLieu q=new QuanLyTuLieu();
        List<TuLieu> a=new ArrayList<>();
        Bao b=new Bao("Hoa hoc tro", "Tien Phong", "02/04/2023", 23000, 100);
        a.add(b);
        b=new Bao("Viet nam news", "thong tan xa", "01/04/2023", 12000, 120);
        a.add(b);
        b=new Bao("Tin tuc", "thong tan xa", "15/04/2023", 8000, 150);
        a.add(b);
        b=new Bao("Bao anh", "thong tan xa", "12/06/2023", 50000, 220);
        a.add(b);
        b=new Bao("Thien than nho", "Tien Phong", "10/08/2023", 20000, 180);
        a.add(b);
        b=new Bao("gia dinh", "Bo y te", "04/02/2022", 10000, 90);
        a.add(b);
        b=new Bao("suc khoe", "Bo y te", "01/02/2022", 15000, 80);
        a.add(b);
        SachHoc s=new SachHoc("Toan cao cap", "Nhat tue", 120, "Giao duc", 80000, 300);
        a.add(s);
        q.setList(a);
        Scanner in=new Scanner(System.in);
        q.sapxepBaoTheoNgay(Integer.parseInt(in.nextLine()));
    }
}
