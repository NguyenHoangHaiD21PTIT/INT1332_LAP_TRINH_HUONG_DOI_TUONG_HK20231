import java.util.*;
import java.io.*;
class KhachHang2{
    private String maKH, tenKH, SDT, ngayMua, stt;
    private long thanhTien;
    public KhachHang2(int y, String tenKH, String SDT, String ngayMua) {
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.ngayMua = ngayMua;
        String []a = this.tenKH.toUpperCase().trim().split("\\s+");
        String s = "";
        for(String x: a) s+=x.charAt(0);
        this.maKH = s + String.format("%03d", y);
        this.stt = this.maKH.substring(this.maKH.length() -3);
    }
    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.ngayMua + " " + this.thanhTien;
    }
    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }   
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    } 
    public String getStt() {
        return stt;
    }
    public String getMaKH() {
        return maKH;
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
public class KT2_12_SUA_HO_TEN_TRONG_DON_HANG {
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
        String x = sc.nextLine();//x: mã đơn hàng, x1: tên sẽ tahy
        int check = 0;
        for(KhachHang2 tmp: a){
            if(tmp.getMaKH().equals(x)){
                check = 1;
                break;
            }
        }
        if(check==0) System.out.println("khong co don hang");
        else {
            String x1 = sc.nextLine();
            for(KhachHang2 tmp: a){
                if(tmp.getMaKH().equals(x)){
                    System.out.println(tmp);
                    String []tmp1 = x1.toUpperCase().trim().split("\\s+");
                    String res = "";
                    for(String q: tmp1) res+=q.charAt(0);
                    res+=tmp.getStt();
                    tmp.setMaKH(res);
                    tmp.setTenKH(x1);
                    System.out.println(tmp);
                }
            }
        }
    }
}
