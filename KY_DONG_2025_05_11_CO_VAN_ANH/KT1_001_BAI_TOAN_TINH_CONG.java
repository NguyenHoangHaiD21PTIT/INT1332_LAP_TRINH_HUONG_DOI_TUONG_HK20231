package KY_DONG_2025_05_11_CO_VAN_ANH;
import java.util.*;
class NhanVien{
    private String hoTen, chucVu;
    private int soNgay;
    private long luongCB;
    //Dẫn xuất
    private long luongThang;
    private double phuCap, thuNhap;
    //
    public NhanVien(){
    }
    public void input(Scanner sc){
        this.hoTen = sc.nextLine();
        this.luongCB = Long.parseLong(sc.nextLine());
        this.soNgay = Integer.parseInt(sc.nextLine());
        this.chucVu = sc.nextLine();
        this.luongThang = this.luongCB * this.soNgay;
    }
    public double getPhuCap(){
        if(this.chucVu.equals("GD")) return 250000;
        else if (this.chucVu.equals("PGD")) return 200000;
        else if (this.chucVu.equals("TP")) return 180000;
        else return 150000;
    }
    public double getThuong(){
        if (this.soNgay >= 25) return this.luongThang * 0.20;
        else if (this.soNgay >= 22) return this.luongThang * 0.10;
        else return 0;
    }
    public double getThuNhap(){
        return (double)this.luongThang + getPhuCap() + getThuong();
    }
    public String ch(String s){
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public void chuanHoa(){
        String []tmp = this.hoTen.trim().split("\\s+");
        String ans = "";
        for(String x: tmp) ans += ch(x) + " ";
        ans = ans.trim();
        this.hoTen = ans;
    }
    public String toString(){
        chuanHoa();
        
        return this.hoTen + " " + this.luongThang + " " + getPhuCap() + " " + getThuNhap();
    }
}
public class KT1_001_BAI_TOAN_TINH_CONG {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        NhanVien tc=new NhanVien();
        tc.input(in);
        System.out.println(tc);
    }
}
/*
bui thI TRAng
45000
23
PGD
*/

