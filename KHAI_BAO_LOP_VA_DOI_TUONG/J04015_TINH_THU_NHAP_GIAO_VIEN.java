/*import java.util.*;
class GiaoVien{
    private String ma, hoten;
    private long luongcb;
    private String chucvu;
    private long heso, phucap, thunhap;
    public GiaoVien(String ma, String hoten, long luongcb){
        this.ma = ma;
        this.hoten = hoten;
        this.luongcb = luongcb;
        this.chucvu = this.ma.substring(0, 2);
        this.heso = Long.parseLong(this.ma.substring(2));
        if (this.chucvu.equals("HT")){
            this.phucap = 2000000;
        } else if (this.chucvu.equals("HP")){
            this.phucap = 900000;
        } else {
            this.phucap = 500000;
        }
        this.thunhap = this.luongcb * this.heso + this.phucap;
    }
    @Override
    public String toString(){
        return this.ma + " " + this.hoten + " " + this.heso + " " + this.phucap + " " + this.thunhap;
    }
}
public class J04015_TINH_THU_NHAP_GIAO_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(a);
    }
} */