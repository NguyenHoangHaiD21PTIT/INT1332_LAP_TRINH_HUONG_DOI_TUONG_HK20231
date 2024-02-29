import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class HS{
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    private String id, name, xeploai;
    private double lt, th, thi, tk;
    public HS(int x, String name, double lt, double th, double thi){
        this.id = "SV" + String.format("%02d", x);
        this.name = chuanhoa2(name);
        this.lt = lt;
        this.th = th;
        this.thi = thi;
        this.tk = this.lt * 25.0/100.0 + this.th * 35.0/100.0 + this.thi * 40.0/100.0;
        if(this.tk>=8){
            this.xeploai = "GIOI";
        } else if (this.tk>=6.5) {
            this.xeploai = "KHA";
        } else if (this.tk>=5){
            this.xeploai = "TRUNG BINH";
        } else {
            this.xeploai = "KEM";
        }
    }
    public double gettk(){
        return this.tk;
    }
    public String toString(){
        return this.id + " " + this.name + String.format("%.2f", this.tk) + " " + this.xeploai;
    } 
}
public class J07055_XEP_LOAI {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner (new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\VAO_RA_FILE\\BANGDIEM.in"));
            int n = sc.nextInt();
            HS []a = new HS[n];
            for(int i = 0;i<n;i++){
                sc.nextLine();
                a[i] = new HS(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            Arrays.sort(a, new Comparator<HS>(){
                public int compare(HS a, HS b){
                    if(a.gettk() > b.gettk()) return -1;
                    else return 1;
                }
            });
            for(HS x: a) System.out.println(x);
        } catch (FileNotFoundException e) {
            e.printStackTrace();;
        }
    }
}
