/*import java.util.*;
import java.io.*;
class San_Pham{
    private String id, ten;
    private long dgl1, dgl2;
    public San_Pham(String id, String ten, long dgl1, long dgl2) {
        this.id = id;
        this.ten = ten;
        this.dgl1 = dgl1;
        this.dgl2 = dgl2;
    }
    public String getId() {
        return this.id;
    }
    public String getTen() {
        return this.ten;
    }
    public long getDgl1() {
        return this.dgl1;
    }
    public long getDgl2() {
        return this.dgl2;
    }
}
class HoaDon{
    private String id, stt, ten; 
    private long sl, giamgia, phaitra, dg;
    public HoaDon(String id, long sl) {
        this.id = id;
        this.sl = sl;
    }
    public void setStt(String x) {
        this.stt = x;
    }
    public void setDg(long x) {
        this.dg = x;
    }
    public String getId() {
        return id;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String toString() {
        return this.id + "-" + this.stt + " "+this.ten + " "+ this.giamgia + " " + this.phaitra;
    }
    public void solve(){
        if(this.sl >= 150){ 
            this.giamgia = this.sl * this.dg * 50 / 100;
            this.phaitra = this.sl * this.dg * 50 / 100;
        } else if (this.sl >=100){
            this.giamgia = this.sl * this.dg * 30 / 100;
            this.phaitra = this.sl * this.dg * 70 / 100;
        } else if (this.sl>=50){
            this.giamgia = this.sl * this.dg * 15 / 100;
            this.phaitra = this.sl * this.dg * 85 / 100;
        } else {
            this.giamgia = 0;
            this.phaitra = this.sl * this.dg;
        }
    }
}
public class J07019_HOA_DON_1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\VAO_RA_FILE\\DATA1.in"));
        int n = sc.nextInt();
        San_Pham []a = new San_Pham[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new San_Pham(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\VAO_RA_FILE\\DATA2.in"));
        int m = sc.nextInt();
        HoaDon []b = new HoaDon[m];
        for(int i = 0;i<m;i++){ 
            sc.nextLine();
            b[i] = new HoaDon(sc.next(), sc.nextLong());
            b[i].setStt(String.format("%03d", i + 1));
        }
        for(HoaDon x: b){
            for(San_Pham y: a){
                if(x.getId().substring(0, 2).equals(y.getId())){
                    x.setTen(y.getTen());
                    System.out.println(y.getDgl1());
                    if(x.getId().endsWith("1")) x.setDg(y.getDgl1());
                    else x.setDg(y.getDgl2());
                    x.solve();
                    break;
                }
            } 
        }
        for(HoaDon x: b) System.out.println(x);
    }
}*/
