package MANG_DOI_TUONG;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
class KhachHang {
    public static long chenhlech(String s1, String s2){
        String []a = s1.trim().split("/");
        String []b = s2.trim().split("/");
        int nam1 = Integer.parseInt(a[2]), thang1 = Integer.parseInt(a[1]), ngay1 = Integer.parseInt(a[0]);
        int nam2 = Integer.parseInt(b[2]), thang2 = Integer.parseInt(b[1]), ngay2 = Integer.parseInt(b[0]);
        LocalDate d1 = LocalDate.of(nam1, thang1, ngay1);
        LocalDate d2 = LocalDate.of(nam2, thang2, ngay2);
        return ChronoUnit.DAYS.between(d1, d2);
    }
    private String maKH, hoTen, phong, ngayNhan, ngayTra;
    private long dichVu;
    public KhachHang(String maKH, String hoTen, String phong, String ngayNhan, String ngayTra, long dichVu) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.phong = phong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.dichVu = dichVu;
    }
    public long soNgay(){
        return chenhlech(ngayNhan, ngayTra) + 1;
    }
    public long tongTien(){
        String x = this.phong.substring(0, 1);
        if(x.equals("1")){
            return soNgay() * 25 + this.dichVu;
        }else if(x.equals("2")){
            return soNgay() * 34 + this.dichVu;
        }else if(x.equals("3")){
            return soNgay() * 50 + this.dichVu;
        }else{
            return soNgay() * 80 + this.dichVu;
        }
    }
    public String toString(){
        return String.format("%s %s %s %d %d", this.maKH, this.hoTen, this.phong, soNgay(), tongTien());
    }
}
public class J05016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            kh.add(new KhachHang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(kh, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if (o1.tongTien() < o2.tongTien()) return 1;
                else return -1;
            }
        });
        for (KhachHang x : kh) {
            System.out.println(x);
        }
    }
}
 
/*3
Huynh Van Thanh
103
05/06/2010
05/06/2010
15
Le Duc Cong
106
08/03/2010
01/05/2010
220
Tran Thi Bich Tuyen
207
10/04/2010
21/04/2010
96*/

 
