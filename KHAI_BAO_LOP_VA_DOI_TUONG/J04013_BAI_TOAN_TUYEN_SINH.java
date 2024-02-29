/*import java.util.*;
import javax.security.auth.AuthPermission;
class HocSinh{
    private String ma, ten, status;
    private double toan, ly, hoa, uutien;
    private double tong, tongfinal;
    public HocSinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(this.ma.charAt(2)=='1'){
            this.uutien = 0.5;
        } else if (this.ma.charAt(2)=='2'){
            this.uutien = 1.0;
        } else {
            this.uutien = 2.5;
        }
        this.tong = this.toan * 2 + this.ly + this.hoa;
        this.tongfinal = this.tong + this.uutien;
        if(this.tongfinal >= 24.0){
            this.status = "TRUNG TUYEN";
        } else {
            this.status = "TRUOT";
        }
    }
    public String toString(){
        String res = "";
        res+= this.ma + " " + this.ten + " ";
        if (this.uutien == 1.0){
            res+="1 ";
        } else {
            res+=String.format("%.1f", this.uutien) + " ";
        }
        if (this.tong == (int)this.tong){
            res+=(int)this.tong + " ";
        } else {
            res+=String.format("%.1f", this.tong) + " ";
        }
        res+=this.status;
        return res;
    }
}
public class J04013_BAI_TOAN_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        HocSinh a = new HocSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(a);
    }
} */
