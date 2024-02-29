/*import java.util.*;
class CongNhan{
    private String mnv, ten, chucvu;
    private long luongcb, day, luongthang, thuong, phucap, thunhap;
    public CongNhan(String ten, long luongcb, long day, String chucvu){
        this.mnv = "NV01";
        this.ten = ten;
        this.luongcb = luongcb;
        this.day = day;
        this.chucvu = chucvu;
        this.luongthang = this.luongcb * this.day;
        if(this.day>=25){
            this.thuong = this.luongthang * 20 / 100;
        } else if (this.day>=22&&this.day<=24){
            this.thuong = this.luongthang * 10 / 100;
        } else {
            this.thuong = 0;
        }
        if(this.chucvu.equals("GD")){
            this.phucap = 250000;
        } else if(this.chucvu.equals("PGD")){
            this.phucap = 200000;
        } else if(this.chucvu.equals("TP")){
            this.phucap = 180000;
        } else {
            this.phucap = 150000;
        }
        this.thunhap = this.luongthang + this.thuong + this.phucap;
    }
    public String toString(){
        return this.mnv + " " + this.ten + " " + this.luongthang + " " + this.thuong + " " + this.phucap + " " + this.thunhap;
    }
}
public class J04012_BAI_TOAN_TINH_CONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine();
        long b = sc.nextLong(), c = sc.nextLong();
        sc.nextLine();
        String d = sc.nextLine();
        CongNhan x = new CongNhan (a, b, c, d);
        System.out.println(x);
    }
}*/
