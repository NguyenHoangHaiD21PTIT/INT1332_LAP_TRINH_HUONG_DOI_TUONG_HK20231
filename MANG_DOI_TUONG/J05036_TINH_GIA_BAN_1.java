import java.util.*;
import java.io.*;
class HHoa{
    private String id, name, dvt;
    private long dongia, sl, phivc, thanhtien, giaban;
    public HHoa(int x, String name, String dvt, long dongia, long sl){
        this.id = "MH" + String.format("%02d", x);
        this.name = name;
        this.dvt = dvt;
        this.dongia = dongia;
        this.sl = sl;
        this.phivc = Math.round(this.dongia * this.sl * 5.0/100.0);
        this.thanhtien = Math.round(this.dongia * this.sl + this.phivc);
        this.giaban = Math.round(this.thanhtien * 102.0/100.0);
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.dvt + " " + this.phivc + " " +this.thanhtien + " " + this.giaban;
    }
}
public class J05036_TINH_GIA_BAN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HHoa []a = new HHoa[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new HHoa(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        for(HHoa x: a) System.out.println(x);
    }
} 
