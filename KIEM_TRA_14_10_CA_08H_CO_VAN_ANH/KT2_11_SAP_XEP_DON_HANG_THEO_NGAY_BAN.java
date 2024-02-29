import java.util.*;
import java.io.*;
class KhachHang2 implements Comparable<KhachHang2>{
    private String maKH, tenKH, SDT, ngayMua;
    private long thanhTien;
    public KhachHang2(int y, String tenKH, String SDT, String ngayMua) {
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.ngayMua = ngayMua;
        String []a = this.tenKH.toUpperCase().trim().split("\\s+");
        String s = "";
        for(String x: a) s+=x.charAt(0);
        this.maKH = s + String.format("%03d", y);
    }
    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.ngayMua + " " + this.thanhTien;
    }
    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }   
    public String getNgayMua() {
        return ngayMua;
    }
    @Override
    public int compareTo(KhachHang2 t) {
        String []a = this.ngayMua.trim().split("/");
        String []b = t.ngayMua.trim().split("/");
        int a0 = Integer.parseInt(a[0]), a1 = Integer.parseInt(a[1]), a2 = Integer.parseInt(a[2]);
        int b0 = Integer.parseInt(b[0]), b1 = Integer.parseInt(b[1]), b2 = Integer.parseInt(b[2]);
        if(a2!=b2) return b2 - a2;
        else if (a1!=b1) return b1 - a1;
        else return b0 - a0;
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
public class KT2_11_SAP_XEP_DON_HANG_THEO_NGAY_BAN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        KhachHang2 []a = new KhachHang2[t];
        for(int i = 0;i<t;i++){
            a[i] = new KhachHang2(i + 1, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());
            int n = Integer.parseInt(sc.nextLine());//số mặt hàng
            ArrayList<DonHang1>b = new ArrayList<>();
            long sum = 0;
            for(int j = 0;j<n;j++){
                b.add(new DonHang1(sc.nextLine(), Long.parseLong(sc.nextLine().trim()), Long.parseLong(sc.nextLine().trim())));
                sum+=b . get(j).getThanhTien();
                a[i].setThanhTien(sum);
            }   
        }
        Arrays.sort(a);
        for(KhachHang2 x: a) System.out.println(x);
    }
}
