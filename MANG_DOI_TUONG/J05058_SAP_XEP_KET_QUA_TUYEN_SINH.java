/*import java.util.*;
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
        if (this.tongfinal == (int)this.tongfinal){
            res+=(int)this.tongfinal + " ";
        } else {
            res+=String.format("%.1f", this.tongfinal) + " ";
        }
        res+=this.status;
        return res;
    }
    public double getfinal(){
        return this.tongfinal;
    }
}
public class J05058_SAP_XEP_KET_QUA_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HocSinh []a = new HocSinh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new HocSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a, new Comparator<HocSinh>(){
            public int compare(HocSinh a, HocSinh b){
                if(a.getfinal()>b.getfinal()) return -1;
                else return 1;
            }
        });
        for(HocSinh x: a) System.out.println(x);
    }
}*/
