import java.util.*;
import java.io.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
class KhachHang{
    public static long chenhlech(String s1, String s2){
        String []a = s1.trim().split("/");
        String []b = s2.trim().split("/");
        int nam1 = Integer.parseInt(a[2]), thang1 = Integer.parseInt(a[1]), ngay1 = Integer.parseInt(a[0]);
        int nam2 = Integer.parseInt(b[2]), thang2 = Integer.parseInt(b[1]), ngay2 = Integer.parseInt(b[0]);
        LocalDate d1 = LocalDate.of(nam1, thang1, ngay1);
        LocalDate d2 = LocalDate.of(nam2, thang2, ngay2);
        return ChronoUnit.DAYS.between(d1, d2);
    }
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    private String id, tenkh, phong, nhan, tra;
    private long phatsinh, dongia, tongngay, tongtien;
    public KhachHang(int x, String tenkh, String phong, String nhan, String tra, long phatsinh){
        this.id = "KH" + String.format("%02d", x);
        this.tenkh = chuanhoa2(tenkh).trim();
        this.phong = phong.trim();
        this.nhan = nhan.trim();
        this.tra = tra.trim();
        this.phatsinh = phatsinh;
        this.tongngay = chenhlech(this.nhan, this.tra) + 1;
        String p = this.phong.substring(0, 1);
        if(p.equals("1")){
            this.dongia = 25;
        } else if (p .equals("2")){
            this.dongia = 34;
        } else if(p.equals("3")){
            this.dongia = 50;
        } else {
            this.dongia = 80;
        }
        this.tongtien = this.tongngay * this.dongia + this.phatsinh;
    }
    public String toString() {
        return String.format("%s %s %s %d %d", this.id, this.tenkh, this.phong, this.tongngay, this.tongtien);
    }
    public long gettong(){
        return this.tongtien;
    }
}
public class J05016_HOA_DON_KHACH_SAN {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        KhachHang []a = new KhachHang[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLong());
        }
        Arrays.sort(a, new Comparator<KhachHang>(){
            public int compare (KhachHang a, KhachHang b){
                if(a.gettong() > b.gettong()) return -1;
                else return 1;
            }
        });
        for(KhachHang x: a) System.out.println(x);
    }
} 
