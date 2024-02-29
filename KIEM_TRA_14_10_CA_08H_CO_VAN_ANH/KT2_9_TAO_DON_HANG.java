import java.util.*;
import java.io.*;
class KhachHang2{
    private String maKH, tenKH, SDT, ngayMua;
    public KhachHang2(String tenKH, String SDT, String ngayMua) {
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.ngayMua = ngayMua;
        String []a = this.tenKH.toUpperCase().trim().split("\\s+");
        String s = "";
        for(String x: a) s+=x.charAt(0);
        this.maKH = s + "001";
    }
    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.ngayMua;
    }
}
class DonHang1{
    private String tenHang;
    private long soLuong, gia, thanhTien;
    public DonHang1(String tenHang, long soLuong, long gia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.gia = gia;
        this.thanhTien = this.soLuong * this.gia;
    }
    public long getThanhTien() {
        return thanhTien;
    }  
}
public class KT2_9_TAO_DON_HANG {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        KhachHang2 a = new KhachHang2(sc.nextLine(), sc.nextLine(), sc.nextLine());
        int n = sc.nextInt();
        long sum = 0;
        DonHang1 []b = new DonHang1[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            b[i] = new DonHang1(sc.nextLine(), sc.nextLong(), sc.nextLong());
            sum+= b[i].getThanhTien();
        }
        System.out.println(a + " " + sum);
    }
}
